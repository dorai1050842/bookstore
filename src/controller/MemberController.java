package controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("test.do")
	public ModelAndView dummy() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", service.getData());
		mav.setViewName("test");
		return mav;
	}
	
	@RequestMapping("memberList.do")
	public ModelAndView memberList() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("memberList", service.getMemberList());
		mav.setViewName("memberList");
		return mav;
		
	}
	
//	Spring MVC 컨트롤러에서 사용할 수 있는 반환유형의 종류
	
//	데이터와 페이지 정보 둘 다 있는경우
//	- ModelAndView
//	
//	데이터에 대한 정보만 있는경우
//	- Model or Map
//	
//	페이지에 대한 정보만 있는경우
//	- String
	@RequestMapping("loginForm.do")
	public String loginForm() {
		return "loginForm";
	}
	
	@RequestMapping("login.do")
	public String login(HttpSession session, String id, String pwd) {
		
		if(service.login(id, pwd)) {
			session.setAttribute("userid", id);
			session.setAttribute("result",true);
		return "redirect:main.do";
		}
		else
			session.setAttribute("result",false);
			return "redirect:loginForm.do";
		
	}
	
	
//	둘 다 없을 때
//	void
	@RequestMapping("joinForm.do")
	public void joinForm() {
		
	}
	
	@RequestMapping("practice.do")
	public void practice() {
		
	}
	
	//매개변수 받아내기
	//join.do는 회원정보 데이터들을 파라미터로 받아서
	//디비에 저장하고, loginForm.do로 리다이렉트 해줄꺼임
	
	
	@RequestMapping("join.do")
	public String join(@RequestParam HashMap<String, Object> params) {
		System.out.println(params);
		service.joinMember(params);
		return "redirect:loginForm.do"; //리다이렉 하는방법
	}
	 
	
	@RequestMapping("main.do")
	public String main(Model model, HttpSession session) {
		String userid = (String)session.getAttribute("userid");
		
//		if(userid == null)
//			return "redirect:loginForm.do";
//		else {
//			model.addAllAttributes(arg0); <- map을 통채로 날리기
//			model.addAttribute(arg0); <- 모델객체 통채로 싣기
//			model.addAttribute(arg0, arg1); <- 키값을 지정해서 하나의 데이터를 싣기
//			System.out.println(model.toString());
			model.addAllAttributes(service.getMemberInfo(userid));
			
			return "main";
//		}
	}
	
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
//		session.removeAttribute("userid");
		session.invalidate();
		return "redirect:loginForm.do";
	}
	
	@RequestMapping("memberUpdateForm.do")
	public String memberUpdateForm(Model model, HttpSession session) {
		
		String userid = (String)session.getAttribute("userid");
		
		if(userid == null)
			return "redirect:loginForm.do";
		
		model.addAllAttributes(service.getMemberInfo(userid));
		return "memberUpdateForm";
		
	}
	
	
	@RequestMapping("memberUpdate.do")
	public String memberUpdate(@RequestParam HashMap<String, Object> params) {
		service.memberUpdate(params);
		
		return "redirect:main.do";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}













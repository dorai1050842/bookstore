package service;

import java.util.HashMap;
import java.util.List;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commons.Constant;
import dao.IMemberDao;

@Service
public class MemberService {
	
	@Autowired
	private IMemberDao dao;

	public String getData() {
		return "I am human";
	}
	
	public List<HashMap<String, Object>> getMemberList(){
		return dao.selectAll();
	}
	
	public void joinMember(HashMap<String, Object> params) {
		if(params.get("pwd").equals(params.get("PWD_CHECK"))) {
			dao.insertMember(params);
			
		}
	}
	
	public boolean login(String id, String pwd) {
		
		HashMap<String, Object> result = dao.selectOne(id);
		
		if(result == null)
			return false;
		
		else {
			String oPwd = (String) result.get(Constant.Member.PWD);
			
			if(oPwd == null)
				return false;
			
			else {
				if(oPwd.equals(pwd))
					return true;
				else 
					return false;
			}
		}
		
		
	}
	
	
	
	public HashMap<String, Object> getMemberInfo(String id){
		return dao.selectOne(id);
	}
	
	public void memberUpdate(HashMap<String, Object> params) {
		if(params.get("pwd").equals(params.get("PWD_CHECK")))
		{
			dao.updateMember(params);
		}
		
		
	}
	
	
	
	

}











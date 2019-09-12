package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String result;
	private Map<String,Object>session;
/*	メソッドを定義*/
	public String execute(){
		LoginDAO loginDAO=new LoginDAO();
		LoginDTO loginDTO=new LoginDTO();
		BuyItemDAO buyItemDAO=new BuyItemDAO();
	/*	インスタンス化*/

		result=ERROR;
//		初期値はエラーに
		loginDTO=loginDAO.getLoginUserInfo(loginUserId, loginPassword);
//		DAOのgetloginInfoを代入

		session.put("loginUser",loginDTO);
//		loginUserキーに、DAOで持ってきたデータを紐付けsessionに格納

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;
//			もし、上で格納した（Flgの中の）データがtrueだった場合
			BuyItemDTO buyItemDTO=buyItemDAO.getBuyItemInfo();
//			ただのインスタンス化

			session.put("login_user_id", loginDTO.getLoginId());
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());
//sessionにそれぞれのキーで
			return result;
		}
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}

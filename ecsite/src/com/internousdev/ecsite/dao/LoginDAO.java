package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {
/*	LoginActionで呼び出される*/

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
//ここで処理内容を分かりやすくするためメソッド名をInfoに、ここのLoginDTOは型名

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		LoginDTO loginDTO=new LoginDTO();
		String sql="SELECT * FROM login_user_transaction where login_id=? AND login_Pass=?";
//ここで実行してるわけではない、定義のみ

		try{
			PreparedStatement ps=con.prepareStatement(sql);
//			DBまで運んでくれる箱

			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
//			上で定義したSQL文の？にActionから送られたデータを入れる

			ResultSet rs=ps.executeQuery();
//			Actionから送られたデータが入ったSQL文が入った箱を実行する
//			SELECT文のためexecuteQuery()を使用

			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));
//				rsで取得した値をloginDTOに格納


				if(rs.getString("login_id")!=null){
					loginDTO.setLoginFlg(true);
				}
//				Actionから渡されたデータと同じものが合った場合（notnull）Flgをtrueにする

			}
		}catch(Exception e){
			e.printStackTrace();
		}
//		SQL関連のエラーしか処理しない

		return loginDTO;
//		loginDTOを呼んだActionクラスに渡す
	}

}

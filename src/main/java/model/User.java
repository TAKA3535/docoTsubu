package model;
//コード10-1 ユーザーに関する情報を持つJavaBeans
import java.io.Serializable;

public class User implements Serializable {
	private String name; //ユーザー名
	private String pass; //パスワード
	
	public User() {}
	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getPass() {
		return pass;
	}
//	public void setPass(String pass) {
//		this.pass = pass;
//	}
	
}

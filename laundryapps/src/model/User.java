package model;

public class User {
	String id, nama, username, passwordn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordn() {
		return passwordn;
	}

	public void setPasswordn(String passwordn) {
		this.passwordn = passwordn;
	}
	public static boolean login(String username, String password) {
	    boolean isLoggin = false;
	    User user = new User();
	    user.setId("1");
	    user.setNama("fulan");
	    user.setUsername("fulan");
	    user.setPassword("12345");

	    if(user.getUsername().equalsIgnoreCase(username)
	        && user.getPassword().equalsIgnoreCase(password)) {
	        isLoggin = true;
	    } else {
	        isLoggin = false;
	    }
	    return isLoggin;
		
	}

	private String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}
}
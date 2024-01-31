package firstproject;

public class Amazonprime {
	private int id;
	private String userName;
	private int subPackage;
	private String showStreaming;
	private int views;
	

	public Amazonprime(int id,String userName,int subPackage,String showStreaming,int views){
		this.id=id;
		this.userName=userName;
		this.subPackage=subPackage;
		this.showStreaming=showStreaming;
		this.views=views;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getSubPackage() {
		return subPackage;
	}


	public void setSubPackage(int subPackage) {
		this.subPackage = subPackage;
	}


	public String getShowStreaming() {
		return showStreaming;
	}


	public void setShowStreaming(String showStreaming) {
		this.showStreaming = showStreaming;
	}


	public int getViews() {
		return views;
	}


	public void setViews(int views) {
		this.views = views;
	}
	

}

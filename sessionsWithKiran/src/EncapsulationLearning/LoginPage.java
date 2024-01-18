package EncapsulationLearning;

public class LoginPage {
	private String uName;
	private String pwd;
	private boolean submitBtn;

	public LoginPage() {
		
	}

	public String getuName() {
		return uName;
	}

	private void setuName(String uName) {
		this.uName = uName;
	}

	public String getPwd() {
		return pwd;
	}

	private void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public boolean isSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(boolean submitBtn) {
		this.submitBtn = submitBtn;
	}

	public void doLogin(String uname, String pwd, boolean submit) {
		setuName(uname);
		setPwd(pwd);
		setSubmitBtn(submit);
		System.out.println(getuName());
		System.out.println(getPwd());
		System.out.println("Submit button clicked" + isSubmitBtn());
		System.out.println("Dashboard visible");

	}

	@Override
	public String toString() {
		return "LoginPage [uName=" + uName + ", pwd=" + pwd + ", submitBtn=" + submitBtn + "]";
	}

}

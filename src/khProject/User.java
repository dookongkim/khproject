package khProject;

public class User {

	private String id; // 이름으로 
	private String pw;
	private String chest_level;// 초급,중급,상급,엘리트 저장
	private String back_level;// 
	private String leg_level;
	private String arm_level;
	
	private String gender;
	//private String muscle;
	//private String fat;
	
	private String[] userinfo= {pw,chest_level,back_level,leg_level,arm_level};

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getChest_level() {
		return chest_level;
	}

	public void setChest_level(String chest_level) {
		this.chest_level = chest_level;
	}

	public String getBack_level() {
		return back_level;
	}

	public void setBack_level(String back_level) {
		this.back_level = back_level;
	}

	public String getLeg_level() {
		return leg_level;
	}

	public void setLeg_level(String leg_level) {
		this.leg_level = leg_level;
	}

	public String getArm_level() {
		return arm_level;
	}

	public void setArm_level(String arm_level) {
		this.arm_level = arm_level;
	}

	public String[] getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(String[] userinfo) {
		this.userinfo = userinfo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	
	
}

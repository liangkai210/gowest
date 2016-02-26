package org.gowest.game.resistant;

public class Player implements Execute {

	public enum Gender {
		MALE(0), FEMALE(1), OTHER(2);

		private int index;

		private Gender(int index) {
			this.index = index;
		}

		public int getIndex() {
			return index;
		}
	}

	private String username;
	private Gender gender;
	private String password;
	private boolean isLeader;
	private Role role;
	private String id;
	private boolean isSelected;

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isLeader() {
		return isLeader;
	}

	public void setLeader(boolean isLeader) {
		this.isLeader = isLeader;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Action execute(Action isOk) {
		if (isSelected)
			return role.execute(isOk);
		else
			return Action.OTHER;
	}

}

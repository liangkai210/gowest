package org.gowest.game.resistant;

public interface Execute {

	public enum Action {
		POSITIVE, NEGATIVE, OTHER;
	}

	public Action execute(Action isOk);

}

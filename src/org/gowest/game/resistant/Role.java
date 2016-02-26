package org.gowest.game.resistant;

public enum Role implements Execute {

	SPY {
		@Override
		public Action execute(Action isOk) {
			return isOk;
		}
	},
	ALLY {
		@Override
		public Action execute(Action isOk) {
			return Action.POSITIVE;
		}
	};

}

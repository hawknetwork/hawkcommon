package org.hawknetwork.common.session.impl;

import org.hawknetwork.common.session.interfaces.Session;
import org.hawknetwork.common.session.interfaces.UserSession;

public class SessionStaticImpl implements Session {
	
	private static UserSession defaultSession;
	
	static {
		defaultSession = new UserSessionObjectImpl();
	}

	public UserSession getDefaultSession() {
		return defaultSession;
	}

	public UserSession getUserSession(String username) {
		// TODO Support multiple users
		return getDefaultSession();
	}

}

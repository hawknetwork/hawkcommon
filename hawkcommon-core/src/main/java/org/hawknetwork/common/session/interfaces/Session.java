package org.hawknetwork.common.session.interfaces;

public interface Session {
	public UserSession getDefaultSession();
	public UserSession getUserSession(String username);
}

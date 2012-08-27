package org.hawknetwork.common.session.interfaces;

public interface UserSession {
	public String getCommandLineParameterValue(String parameterName);
	public void setCommandLineParameters(String[] args);
	public boolean containsCommandLineParameter(String attributeName);
	public Object getAttribute(String attributeName);
	public void setAttribute(String attributeName, Object attributeValue);
	public boolean containsAttribute(String attributeName);
}

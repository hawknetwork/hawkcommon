package org.hawknetwork.common.session.impl;

import java.util.HashMap;
import java.util.Map;

import org.hawknetwork.common.session.interfaces.UserSession;

public class UserSessionObjectImpl implements UserSession {
	
	private Map<String,String> commandLineParameters;
	private Map<String,Object> attributes;
	
	UserSessionObjectImpl() {
		commandLineParameters = new HashMap<String,String>();
		attributes = new HashMap<String,Object>();
	}

	public String getCommandLineParameterValue(String parameterName) {
		return commandLineParameters.get(parameterName);
	}

	public void setCommandLineParameters(String[] args) {
		// TODO loop through and detect
	}

	public Object getAttribute(String attributeName) {
		return attributes.get(attributeName);
	}

	public void setAttribute(String attributeName, Object attributeValue) {
		attributes.put(attributeName, attributeValue);
	}

	public boolean containsAttribute(String attributeName) {
		return attributes.containsKey(attributeName);
	}

	public boolean containsCommandLineParameter(String attributeName) {
		return commandLineParameters.containsKey(attributeName);
	}
}

package org.hawknetwork.common.base.impl;

import org.hawknetwork.common.serialization.impl.ObjectResolver;

public abstract class BaseKeyResolvingDomainClass {
	private String key;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object readResolve() {
		return ObjectResolver.resolveObject(this.getClass(),this.getKey(),this);
	}
}

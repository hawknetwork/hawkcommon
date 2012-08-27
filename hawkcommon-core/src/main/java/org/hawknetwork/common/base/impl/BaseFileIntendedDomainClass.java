package org.hawknetwork.common.base.impl;

public abstract class BaseFileIntendedDomainClass extends BaseKeyResolvingDomainClass {
	private long timestamp;
	private boolean finalised;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isFinalised() {
		return finalised;
	}

	public void setFinalised(boolean finalised) {
		this.finalised = finalised;
	}
}

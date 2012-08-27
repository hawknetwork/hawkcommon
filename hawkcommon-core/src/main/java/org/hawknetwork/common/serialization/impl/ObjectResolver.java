package org.hawknetwork.common.serialization.impl;

import java.util.HashMap;
import java.util.Map;

public class ObjectResolver {
	private static Map<Class<? extends Object>,Map<String,Object>> resolvedObjects = null;
	public static Object resolveObject(Class<? extends Object> cls, String key, Object current) {
		Map<String,Object> innerMap;
		
		if (resolvedObjects == null) {
			resolvedObjects = new HashMap<Class<? extends Object>,Map<String,Object>>();
		}
		
		if (resolvedObjects.containsKey(cls)) {
			innerMap = resolvedObjects.get(cls);
		} else {
			innerMap = new HashMap<String,Object>();
			resolvedObjects.put(cls,innerMap);
		}
		
		if (innerMap.containsKey(key)) {
			return innerMap.get(key);
		} else {
			innerMap.put(key,current);
			return current;
		}
	}
}

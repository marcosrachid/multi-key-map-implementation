package com.custom.multikey.map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public abstract class MultiKey {

	@Override
	public final int hashCode() {
		return 1;
	}

	@Override
	public final boolean equals(Object obj) {
		Map<String, Object> map = new HashMap<>();
		try {
			Field[] fields = getClass().getDeclaredFields();
			if (!getClass().isInstance(obj)) {
				return false;
			}
			for (Field field : fields) {
				field.setAccessible(true);
				map.put(field.getName(), field.get(this));
			}
			Field[] otherFields = getClass().cast(obj).getClass().getDeclaredFields();
			for (Field field : otherFields) {
				field.setAccessible(true);
				if (map.get(field.getName()) != null && map.get(field.getName()).equals(field.get(obj)))
					return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}

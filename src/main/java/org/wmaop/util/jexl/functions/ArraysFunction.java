package org.wmaop.util.jexl.functions;

import java.util.regex.Pattern;

public class ArraysFunction {
	
	public ArraysFunction() {}

	public boolean contains(String[] arr, String regex) {
		if (arr == null) throw new RuntimeException("Array passed to arrays:contains is null");
		
		for (String v : arr) {
			if (v.contains(regex)) return true;
		}
		return false;
	}

	public boolean matches(String[] arr, String regex) {
		if (arr == null) throw new RuntimeException("Array passed to arrays:matches is null");

		Pattern p = Pattern.compile(regex);
		for (String v : arr) {
			if (p.matcher(v).matches()) return true;
		}
		return false;
	}

}

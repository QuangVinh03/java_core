package java_core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Set.of(7,3,4,9,1));
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
            System.out.println( iterator.next());
        }

		
	}
}

package test2;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("1");
		s.add("2");
		s.add("1");
		System.out.println(s.size());
	}
}

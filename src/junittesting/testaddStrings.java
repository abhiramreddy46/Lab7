package junittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		junitfunction junitstring=new junitfunction();
		String result=junitstring.addStrings("Bennett","University");
		assertEquals("BennettUniversity",result);
	}

}

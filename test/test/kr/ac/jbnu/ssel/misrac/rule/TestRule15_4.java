package test.kr.ac.jbnu.ssel.misrac.rule;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import kr.ac.jbnu.ssel.misrac.rulesupport.ViolationMessage;
import test.kr.ac.jbnu.ssel.misrac.rule.testsupport.AbstractTestRule;

/**
 * Sample Implementation for testing misra-c rule that has been implemented
 * without executing Eclipse CDT.
 * 
 * @author sangjin
 *
 */
public class TestRule15_4 extends AbstractTestRule {
	public TestRule15_4() {
		super("Rule15_4_Req", "TestRule15_4.C");
	}

	@Test
	public void test() {
		try {
			ArrayList<ViolationMessage> violationMsgs = checkRule();

			System.out.println("size:" + violationMsgs.size());
			for (ViolationMessage violationMessage : violationMsgs) {
				System.out.println(violationMessage);
			}

			assertTrue(violationMsgs.size() == 1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

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
 * 
 * 
 * @author sangjin
 *
 */

public class TestRule05_6 extends AbstractTestRule {
	public TestRule05_6() {
		super("Rule05_6_Adv", "TestRule05_6.C");
	}

	@Test
	public void test() {
		try {
			ArrayList<ViolationMessage> violationMsgs = checkRule();
			System.out.println(violationMsgs);
			System.out.println("size:" + violationMsgs.size());

			assertTrue(violationMsgs.size() == 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
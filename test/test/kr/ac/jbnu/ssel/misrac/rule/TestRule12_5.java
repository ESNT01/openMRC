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
 * DONE!!
 * 
 * @author stkim
 *
 */
public class TestRule12_5 extends AbstractTestRule {
	public TestRule12_5() {
		super("Rule12_5_Req", "TestRule12_5.C");
	}

	@Test
	public void test() {
		try {
			ArrayList<ViolationMessage> violationMsgs = checkRule();
			System.out.println(violationMsgs);
			System.out.println("size:" + violationMsgs.size());

			assertTrue(violationMsgs.size() == 4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

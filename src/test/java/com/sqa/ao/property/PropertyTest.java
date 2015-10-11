/**
 *   File Name: PropertyTest.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 10, 2015
 *   
 */

package com.sqa.ao.property;

import org.junit.Test;

/**
 * PropertyTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PropertyTest {

	@Test
	public void test() {
		PropProject myProject = new PropProject();
		myProject.demoLoad();
		myProject.display();
		myProject.demoSave();
		myProject.changevalues();
	}

}

/**
 *   File Name: PropertiesTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 10, 2015
 *
 */

package com.sqa.ao.property;

import org.junit.Test;

import com.sqa.ao.property.PropProject;

/**
 * PropertiesTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PropertiesTest {

	@Test
	// Demo run working with the Properties Class and a porpertiesfile
	public void test() {
		// Create the Properties object
		PropProject myProject = new PropProject();
		// Run the demoLoad method to see sample load case
		myProject.demoLoad();
		// Run the demoLoad method to display the class set variables (Not the
		// Properties object values)
		myProject.display();
		// Change the value of the name variables than set the Properties object
		// to reflect this change
		myProject.changeValues();
		// Demo the save operation to save a Properties object to a text file on
		// hard drive saved-properties.prop
		myProject.demoSave();
		// *Make sure to refresh Package Explorer for your project to see saved
		// properties.prop file
	}
}

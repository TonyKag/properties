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

		// load Properties file from location
		String fileLoation;
		fileLoation = "D://prop_properties.prop";
		myProject.loadProperties(fileLoation);

		myProject.saveProperties(fileLoation, myProject.props);

		myProject.convertPropertiesToMap(myProject.props);

		String[] myNames = new String[5];
		myNames = myProject.retrievePropertyNames(myProject.props);

		String myString = "This is my string. (2 * 15) = 120 / 4 . Let's find characters";
		String last6Characters;
		last6Characters = myProject.getLast6Characters(myString);

		String evenCharacters;
		evenCharacters = myProject.getEvenCharacters(myString);

		String vowelessString;
		vowelessString = myProject.getVowelessString(myString);

		String numberCharacters;
		numberCharacters = myProject.getNumberCharacters(myString);
	}
}
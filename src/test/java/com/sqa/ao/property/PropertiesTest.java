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
		
		
		//I would like you to implement the following two methods:

		public static Properties loadProperties( String  fileLocation);
		public static void saveProperties(String fileLoation, Properties props);

		//Also implement any one of each of the following 2 set of methods:

		public static Map<String,String> convertPropertiesToMap(Properties props);
		public static Properties convertMapTpProperties(HashMap<String,String> map);

		public static String[] retrievePropertyNames(Properties props);
		public static String[] retievePropertyValues(Properties props);

		//Also implement any one of each of the following 4 set of methods:

		public static String getLast6Characters(String string);
		public static String getFirst73Characters(String string);

		public static String getEvenCharacters(String string);
		public static String geOddCharacters(String string);

		public static String getConstantlessString(String string);
		public static String getVowelessString(String string);

		public static String getNumberCharacters(String string);
		public static String getLetterCharacters(String string);
	}
}

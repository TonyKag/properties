/**
 * File Name: PropProject.java<br>
 * LastName, FirstName<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 10, 2015
 */
package com.sqa.ao.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * PropProject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 */
public class PropProject {

	public static String job;

	public static Properties props;;

	public static Map<String, String> convertPropertiesToMap(Properties props) {
		Map mapProperties = new HashMap();
		mapProperties.put("name", props.getProperty("name"));
		mapProperties.put("address", props.getProperty("address"));
		mapProperties.put("age", props.getProperty("age"));
		mapProperties.put("city", props.getProperty("city"));
		mapProperties.put("selenium", props.getProperty("selenium"));

		System.out.println(
				mapProperties.get("name") + "\n" + mapProperties.get("address") + "\n" + mapProperties.get("age") + "\n"
						+ mapProperties.get("city") + "\n" + mapProperties.get("selenium") + "\n");

		return null;
	};

	public static String getEvenCharacters(String string) {
		String result = "";
		char[] ch = string.toCharArray();

		for (int i = 0, j = 0; i < string.length(); i += 2, j++) {
			ch[i] = string.charAt(j);
		}
		result = ch.toString();
		return result;
	};

	public static String getJob() {
		return job;
	};

	public static String getLast6Characters(String string) {
		String result = string.substring(string.length() - 6);
		return result;
	};

	public static String getNumberCharacters(String string) {

		String result = " ";
		return result;
	};

	/**
	 * @return the props
	 */
	public static Properties getProps() {
		return props;
	}

	public static String getVowelessString(String string) {

		String result = " ";
		return result;
	}

	public static Properties loadProperties(String fileLocation) {
		// Create a new instance of the Properties class
		props = new Properties();
		// Surround with try catch for error handling of file not being present
		// and if an IO due to bad connection occur
		try {
			// Use a FileInputStream and set it to the location of the file
			// "my-properties.prop"
			// This may cause a FileNotFoundException
			FileInputStream fis = new FileInputStream(fileLocation);
			// Load the properties of the text file into the Properties object
			// This may cause IOException due to connection errors
			props.load(fis);
			// Set the name of current instance to the Properties object's value
			setName(props.getProperty("name"));
			// Set the age of current instance to the Properties object's value,
			// also Parse it to int
			setAge(Integer.parseInt(props.getProperty("age")));
			// Set the city of current instance to the Properties object's value
			setCity(props.getProperty("city"));
			// Set the address of current instance to the Properties object's
			// value
			setAddress(props.getProperty("address"));
			// Set the job of current instance to the Properties object's value
			setJob(props.getProperty("job"));
			// Set selenium info
			setSelenium(props.getProperty("selenium"));
		} catch (FileNotFoundException e) {
			// Handle file not found exception scenario
			e.printStackTrace();
		} catch (IOException e) {
			// Handle IO exception scenario
			e.printStackTrace();
		}
		return props;
	}

	public static String[] retrievePropertyNames(Properties props) {
		String[] n = new String[1];
		n[0] = props.entrySet().toString();
		System.out.println(n[0].toString());
		return n;
	}

	public static void saveProperties(String fileLocation, Properties props) throws IOException {
		props.setProperty("job", getJob());
		FileOutputStream fos = new FileOutputStream(fileLocation);
		props.store(fos, null);
	}

	public static void setAddress(String address) {
		address = address;
	}

	public static void setAge(int age) {
		age = age;
	}

	public static void setCity(String city) {
		city = city;
	}

	public static void setJob(String job) {
		job = job;
	}

	public static void setName(String name) {
		name = name;
	};

	/**
	 * @param props
	 *            the props to set
	 */
	public static void setProps(Properties props) {
		PropProject.props = props;
	}

	public static void setSelenium(String selenium) {
		selenium = selenium;
	}

	private String address;

	private int age;

	private String city;

	private String fileLocation = "D://Workspace/additional.prop";

	private String name;

	private String selenium;

	/**
	 * Method that changes values of current instance and the Properties object
	 */
	public void changeValues() {
		// Change the value of the current instance's job variable to
		// "automation engineer"
		this.job = "automation engineer";
		// Set the Property of the Properties object for key "name" to
		// <current-name of instance>, "automation engineers"
		this.props.setProperty("job", this.getJob());
	}

	/**
	 * Method that loads the Properties object from the text file and set
	 * instance field values based on them
	 */
	public void demoLoad() {
		// Create a new instance of the Properties class
		this.props = new Properties();
		// Surround with try catch for error handling of file not being present
		// and if an IO due to bad connection occur
		try {
			// Use a FileInputStream and set it to the location of the file
			// "my-properties.prop"
			// This may cause a FileNotFoundException
			FileInputStream fis = new FileInputStream("my-properties.prop");
			// Load the properties of the text file into the Properties object
			// This may cause IOException due to connection errors
			this.props.load(fis);
			// Set the name of current instance to the Properties object's value
			this.setName(this.props.getProperty("name"));
			// Set the age of current instance to the Properties object's value,
			// also Parse it to int
			this.setAge(Integer.parseInt(this.props.getProperty("age")));
			// Set the city of current instance to the Properties object's value
			this.setCity(this.props.getProperty("city"));
			// Set the address of current instance to the Properties object's
			// value
			this.setAddress(this.props.getProperty("address"));
			// Set the job of current instance to the Properties object's value
			this.setJob(this.props.getProperty("job"));
			// Set selenium info
			this.setSelenium(this.props.getProperty("selenium"));
		} catch (FileNotFoundException e) {
			// Handle file not found exception scenario
			e.printStackTrace();
		} catch (IOException e) {
			// Handle IO exception scenario
			e.printStackTrace();
		}
	}

	/**
	 * Method that demo the store or save operation of converting the Properties
	 * ojbect to a text file
	 */
	public void demoSave() {
		try {
			// Create a FileOutputStream and set it to location where you want
			// to save the converted Properties object to
			// This may cause a FileNotFoundException
			// FileOutputStream fos = new
			// FileOutputStream("saved-properties.prop");
			FileOutputStream fos = new FileOutputStream("saved-properties.prop");
			// Save the properties object to the converted text file specified
			// in FileOutputStream, second param is first line in file text,
			// heading
			// This may cause an IOException
			this.props.store(fos, "My Properties File: " + this.getName());
		} catch (FileNotFoundException e) {
			// Handle file not found exception scenario
			e.printStackTrace();
		} catch (IOException e) {
			// Handle IO exception scenario
			e.printStackTrace();
		}
	}

	/**
	 * Method that displays the current instance variable values by calling the
	 * toString() method of itself to console
	 */
	public void display() {
		System.out.println(this);
	}

	public String getAddress() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	public String getCity() {
		return this.city;
	}

	/**
	 * @return the fileLoation
	 */
	public String getFileLocation() {
		return this.fileLocation;
	}

	public String getName() {
		return this.name;
	}

	public String getSelenium() {
		return this.selenium;
	}

	/**
	 * @param fileLoation
	 *            the fileLoation to set
	 */
	public void setFileLoation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PropProject [address=" + address + ", age=" + age + ", city=" + city + ", fileLocation=" + fileLocation
				+ ", name=" + name + ", selenium=" + selenium + ", getAddress()=" + getAddress() + ", getAge()="
				+ getAge() + ", getCity()=" + getCity() + ", getFileLocation()=" + getFileLocation() + ", getName()="
				+ getName() + ", getSelenium()=" + getSelenium() + "]";
	}

}
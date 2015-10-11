/**
 *   File Name: PropProject.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 10, 2015
 *   
 */

package com.sqa.ao.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PropProject {
	private String address;
	private int age;
	private String city;
	private String job;
	private String name;

	Properties props;

	/**
	 * 
	 */
	public void changevalues() {
		// TODO Auto-generated method stub
		this.setName("Mr. Benas");

	}

	public void demoLoad() {
		// TODO Auto-generated method stub
		props = new Properties();
		try {
			FileInputStream fis = new FileInputStream("my-properties.prop");
			props.load(fis);

			this.setName(props.getProperty("name"));
			this.setAge(Integer.parseInt(props.getProperty("age")));
			this.setAddress(props.getProperty("address"));
			this.setCity(props.getProperty("city"));
			this.setJob(props.getProperty("job"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public void demoSave() {
		// TODO Auto-generated method stub
		props.setProperty("name", "Mr Bananaus");
		try {
			FileOutputStream fos = new FileOutputStream("saved-properties.prop");
			props.store(fos, "My properties File: " + this.getName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param job
	 *            the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropProject [address=");
		builder.append(address);
		builder.append(", age=");
		builder.append(age);
		builder.append(", city=");
		builder.append(city);
		builder.append(", job=");
		builder.append(job);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}

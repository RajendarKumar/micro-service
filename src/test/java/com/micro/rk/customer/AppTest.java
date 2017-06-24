package com.micro.rk.customer;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);
	@BeforeClass
	public static void setup() throws IOException{
		System.setProperty("log4j.configuration", new File("").getCanonicalPath()+File.separatorChar+"src"+File.separatorChar+"test"+File.separatorChar+"resources"+File.separatorChar+"log4j.xml" );
	}

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp()
	{
		LOGGER.debug("Debug level logger active and working fine, Cheers.");
		Assert.assertTrue( true );
	}
}

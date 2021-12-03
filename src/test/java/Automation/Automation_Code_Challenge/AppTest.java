package Automation.Automation_Code_Challenge;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
/**
 * Create the test case
 *
 * @param testName name of the test case
 */
public AppTest( String testName )
{
    super( testName );
}

/**
 * @return the suite of tests being tested
 */
public static TestSuite suite()
{
    return new TestSuite( AppTest.class );
}

/**
 * Rigorous Test :-)
 */
public void testApp()
{
    assertTrue( true );
}
}
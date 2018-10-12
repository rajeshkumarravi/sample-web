package sample.net.hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import sample.net.hello.EchoResource;

/**
 * Unit test for EchoResource
 */
public class EchoResourceTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EchoResourceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EchoResourceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testEchoResource()
    {
        EchoResource echo = new EchoResource();

        String expected = "echo: test message";
        extracted(echo, expected);
        //assertTrue( true );
    }

    private void extracted(EchoResource echo, String expected) {
        assertEquals(expected, echo.echo("test message"));
    }
}
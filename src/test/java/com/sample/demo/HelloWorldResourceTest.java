package com.sample.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.sample.demo.HelloWorldResource;

/**
 * Unit test for HelloWorldResource.
 */
public class HelloWorldResourceTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldResourceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloWorldResourceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHelloWorldResource()
    {
        HelloWorldResource hello = new HelloWorldResource();

        String expected = "hello";
        extracted(hello, expected);
        //assertTrue( true );
    }

    private void extracted(HelloWorldResource hello, String expected) {
        assertEquals(expected, hello.sayhello());
    }
}
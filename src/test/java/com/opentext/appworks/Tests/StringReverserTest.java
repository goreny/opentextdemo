package com.opentext.appworks.Tests;

import com.opentext.appworks.StringReverser;
import com.opentext.appworks.StringReverserImpl;
import org.junit.Assert;
import org.junit.Test;

public class StringReverserTest {

    @Test
    public void testReverseStringInPlace() {
        String testString = "test";
        String reverse = "";

        StringReverser reverser = new StringReverserImpl();
        String reversed = reverser.reverseStringInPlace(testString.toCharArray());

        for (int i = testString.length()-1; i >= 0; i--) {
            reverse = reverse + reversed.charAt(i);
        }
        System.out.print("# -> " + reverse);

        Assert.assertEquals("tset", reverse);
    }

}

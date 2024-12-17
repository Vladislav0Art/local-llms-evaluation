package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlBuilderAppendToAsciiWithSpaceAsPlusTests {

    @Test
    public void urlBuilderAppendToAsciiWithSpaceAsPlusTests() {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("Hello World", true, sb);
        assertEquals("+%20Hello+World", sb.toString());
    }

}
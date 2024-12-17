package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlBuilderAppendToAsciiWithoutSpaceAsPlusTests {

    @Test
    public void urlBuilderAppendToAsciiWithoutSpaceAsPlusTests() {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("Hello World", false, sb);
        assertEquals("%3DHallo%20World", sb.toString());
    }

}
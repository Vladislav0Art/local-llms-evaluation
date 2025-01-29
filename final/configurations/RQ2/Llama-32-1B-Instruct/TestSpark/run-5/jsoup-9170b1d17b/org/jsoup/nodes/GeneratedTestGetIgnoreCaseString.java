package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTestGetIgnoreCaseString {

    public static void main(String[] args) throws IOException {
        TestSparkRunner.testRun();
    }

    @Test
    public void testGetIgnoreCaseString() {
        Attributes attributes = new Attributes();
        assertEquals("value", attributes.getIgnoreCase("key"));
    }

}
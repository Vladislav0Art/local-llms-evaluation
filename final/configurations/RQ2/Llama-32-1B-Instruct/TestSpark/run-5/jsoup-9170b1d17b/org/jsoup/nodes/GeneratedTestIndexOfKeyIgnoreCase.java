package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTestIndexOfKeyIgnoreCase {

    public static void main(String[] args) throws IOException {
        TestSparkRunner.testRun();
    }

    @Test
    public void testIndexOfKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.indexOfKeyIgnoreCase("test"));
    }

}
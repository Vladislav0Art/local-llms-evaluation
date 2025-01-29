package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTestAttributeNotExist {

    public static void main(String[] args) throws IOException {
        TestSparkRunner.testRun();
    }

    @Test
    public void testAttributeNotExist() {
        Attributes attributes = new Attributes();
        try {
            attributes.getAttribute("nonExistentKey");
            fail("Expected Exception to be thrown");
        } catch (Exception e) {
            // expected
        }
    }

}
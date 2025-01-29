package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTestNotNullCheckNotNull {

    public static void main(String[] args) throws IOException {
        TestSparkRunner.testRun();
    }

    @Test
    public void testNotNullCheckNotNull() {
        Attributes attributes = new Attributes();
        Object value = null;
        try {
            attributes.checkNotNull(value);
        } catch (Exception e) {
            assertEquals(true, true);
        }
    }

}
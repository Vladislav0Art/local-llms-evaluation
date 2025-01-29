package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestWholeText {

    @Test
    public void testWholeText() {
        String text = "Hello, world! This is a test.";
        Document document = new Document();
        document.append(text);
        assertEquals("Hello, world! This is a test.", document.getWholeText());
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestWholeOwnText {

    @Test
    public void testWholeOwnText() {
        String text = "Hello, world!";
        Document document = new Document();
        document.append(text);
        assertEquals("Hello, world!", document.getWholeOwnText());
    }

}
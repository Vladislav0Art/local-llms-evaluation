package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestText {

    @Test
    public void testText() {
        String text = "Hello, world!";
        Document document = new Document();
        document.append(text);
        assertEquals("Hello, world!", document.getText());
    }

}
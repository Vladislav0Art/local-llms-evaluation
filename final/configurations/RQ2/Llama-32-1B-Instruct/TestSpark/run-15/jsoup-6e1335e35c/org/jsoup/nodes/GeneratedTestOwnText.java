package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOwnText {

    @Test
    public void testOwnText() {
        String text = "This is a test.";
        Document document = new Document();
        document.append(text);
        assertEquals("This is a test.", document.getOwnText());
    }

}
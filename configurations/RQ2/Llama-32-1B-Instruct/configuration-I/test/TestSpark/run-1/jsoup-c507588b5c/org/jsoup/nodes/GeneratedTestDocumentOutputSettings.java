package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDocumentOutputSettings {

    @Test
    public void testDocumentOutputSettings() {
        String html = "<p>Hello World!</p>";
        String expectedHtml = "<p>Hello <b>World</b></p>";

        String actualHtml = convertHtml(html);

        assertEquals(expectedHtml, actualHtml);
    }

    private String convertHtml(String html) {
        HTMLWriter writer = new HTMLWriter();
        return writer.write(html);
    }

}
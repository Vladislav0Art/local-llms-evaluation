package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetOutputSettingsTextContent {

    @Test
    public void testGetOutputSettingsTextContent() {
        Document document = new Document();
        OutputSettings settings = new Document("https://www.example.com").outputSettings(true);
        String text = settings.output(document, "form");
        assertEquals("Hello, World!", text);
    }

}
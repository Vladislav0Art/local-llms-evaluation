package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestCreateOutputSettings {

    @Test
    public void testCreateOutputSettings() {
        Document document = new Document();
        OutputSettings settings = new Document("https://www.example.com").outputSettings(true);
        assertEquals(true, settings.update());
    }

}
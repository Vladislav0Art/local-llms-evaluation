package org.jsoup.nodes;

public class GeneratedTestOutputSettingsNull {

    @Test
    public void testOutputSettingsNull() {
        Document document = new Document();
        assertThrows(NullPointerException.class, () -> document.outputSettings(null));
    }
}

}
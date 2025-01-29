package org.jsoup.nodes;

public class GeneratedOutputSettings {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void outputSettings() throws Exception {
        Document doc = createDocument(BASE_URI);
        OutputSettings outputSettings = doc.outputSettings();
        assertNotNull(outputSettings);
    }

}
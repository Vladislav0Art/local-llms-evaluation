package org.jsoup.nodes;

public class GeneratedOutputSettings_test {

    @Test
    public void outputSettings_test() {
        Document document = new Document("http://example.com");
        OutputSettings settings = new OutputSettings();
        document.outputSettings(settings);
        assertNotNull(settings);
    }

}
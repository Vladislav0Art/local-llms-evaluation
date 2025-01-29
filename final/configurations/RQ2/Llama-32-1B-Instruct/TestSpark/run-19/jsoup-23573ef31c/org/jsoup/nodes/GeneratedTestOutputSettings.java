package org.jsoup.nodes;

public class GeneratedTestOutputSettings {

    @Test
    public void testOutputSettings() {
        Document document = new Document("https://example.com");
        assertEquals("", document.outputSettings().toString());
        document.outputSettings(new OutputSettings());
        assertEquals("<style>body { background-color: #f2f2f2; }</style>", document.outputSettings().toString());
    }

}
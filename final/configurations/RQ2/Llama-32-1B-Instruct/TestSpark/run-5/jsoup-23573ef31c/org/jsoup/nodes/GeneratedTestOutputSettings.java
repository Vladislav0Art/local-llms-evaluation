package org.jsoup.nodes;

public class GeneratedTestOutputSettings {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testOutputSettings() {
        OutputSettings outputSettings = document.outputSettings();
        assertEquals(null, outputSettings.toString());
    }
}

class DocumentParserTests {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

}
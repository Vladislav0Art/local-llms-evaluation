package org.jsoup.nodes;

public class GeneratedQuirksMode_test5 {

    private Document document;

    @Before
    public void setup() {
        Document.createShell("http://example.com");
        document = new Document("http://example.com");
    }

    @Test
    public void quirksMode_test5() {
        QuirksMode defaultQuirks = document.quirksMode();
        assertEquals(0, defaultQuirks);
        defaultQuirks = document.quirksMode(QuirksMode.ALL);
        assertEquals(1, defaultQuirks);
    }

}
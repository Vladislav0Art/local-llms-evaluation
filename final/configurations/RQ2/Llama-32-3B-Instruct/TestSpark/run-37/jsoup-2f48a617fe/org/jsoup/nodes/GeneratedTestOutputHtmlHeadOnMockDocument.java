package org.jsoup.nodes;

public class GeneratedTestOutputHtmlHeadOnMockDocument {

    @Test
    public void testOutputHtmlHeadOnMockDocument() {
        Appendable accum = mockDoc.body();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        MockParser parser = new MockParser();
        parser.outerHtmlHead(accum, depth, out);
    }

}
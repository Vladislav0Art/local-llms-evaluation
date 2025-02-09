package org.jsoup.nodes;

public class GeneratedTestOutputHtmlTailOnMockDocument {

    @Test
    public void testOutputHtmlTailOnMockDocument() {
        Appendable accum = mockDoc.body();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        MockParser parser = new MockParser();
        parser.outerHtmlTail(accum, depth, out);
    }

}
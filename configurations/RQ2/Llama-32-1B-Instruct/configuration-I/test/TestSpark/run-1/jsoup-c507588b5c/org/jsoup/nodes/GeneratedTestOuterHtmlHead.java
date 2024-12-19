package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        String html = "<html><body>Hello World</body></html>";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(HTML.UTF_8);
        node.outerHtmlHead(accum, 1, out);
        assertEquals(html, accum.toString());
    }

}
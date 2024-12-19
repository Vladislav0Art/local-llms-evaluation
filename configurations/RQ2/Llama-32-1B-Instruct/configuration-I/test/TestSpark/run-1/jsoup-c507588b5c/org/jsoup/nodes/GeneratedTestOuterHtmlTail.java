package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        String html = "<html><body>Hello World</body></html>";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(HTML.UTF_8);
        node.outerHtmlTail(accum, 1, out);
        assertEquals(html, accum.toString());
    }

}
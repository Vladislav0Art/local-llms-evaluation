package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void outerHtmlTail_Test() throws IOException {
        StringBuilder expected = new StringBuilder("</text>");
        Appendable accum = new StringBuffer();
        Document.OutputSettings out = new Document.OutputSettings();
        node.outerHtmlTail(accum, 0, out);
        assertTrue(accum.toString().equals(expected));
    }

}
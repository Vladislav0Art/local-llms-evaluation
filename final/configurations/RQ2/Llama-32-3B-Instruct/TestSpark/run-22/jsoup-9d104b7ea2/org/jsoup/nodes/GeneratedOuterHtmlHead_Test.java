package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void outerHtmlHead_Test() throws IOException {
        StringBuilder expected = new StringBuilder("<text>Hello, World!</text>");
        Appendable accum = new StringBuffer();
        Document.OutputSettings out = new Document.OutputSettings();
        node.outerHtmlHead(accum, 0, out);
        assertTrue(accum.toString().equals(expected));
    }

}
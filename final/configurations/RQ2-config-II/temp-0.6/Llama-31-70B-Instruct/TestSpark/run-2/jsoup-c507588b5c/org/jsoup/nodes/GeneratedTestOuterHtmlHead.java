package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Appendable accum = mock(Appendable.class);

        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.create());

        verify(accum).append("Some text");
    }

}
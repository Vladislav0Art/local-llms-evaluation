package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffset_ReturnsTextNode {

    @Test
    public void splitText_GivenOffset_ReturnsTextNode() throws IOException {
        // given
        TextNode textNode = new TextNode("Hello World");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        int offset = 6;

        // when
        TextNode result = textNode.splitText(offset);

        // then
        assertNotNull(result);
    }

}
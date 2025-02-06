package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_headElementTest {

    @Test
    public void outerHtmlHead_headElementTest() {
        Document document = mock(Document.class);
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode("<p>Hello</p>");
        node.outerHtmlHead(accum, depth, out);
        verify(document).append(out.getHeadElement().toString());
    }

}
package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_tailElementTest {

    @Test
    public void outerHtmlTail_tailElementTest() {
        Document document = mock(Document.class);
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode("<p>Hello</p>");
        node.outerHtmlTail(accum, depth, out);
        verify(document).append(out.getTailElement().toString());
    }

}
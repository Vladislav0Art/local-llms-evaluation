package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_GivenDocumentSettings_CreatesCorrectHtml {

    @Test
    public void outerHtmlTail_GivenDocumentSettings_CreatesCorrectHtml() throws IOException {
        // given
        Document document = new Document();
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings settings = mock(Document.OutputSettings.class);

        // when
        TextNode node = new TextNode("test");
        node.outerHtmlTail(accum, 0, settings);

        // then
        verify(accum).append(anyString());
    }

}
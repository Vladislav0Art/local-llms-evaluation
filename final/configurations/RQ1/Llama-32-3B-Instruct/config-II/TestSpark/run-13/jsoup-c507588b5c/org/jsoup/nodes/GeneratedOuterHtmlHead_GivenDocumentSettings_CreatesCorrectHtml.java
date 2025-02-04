package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_GivenDocumentSettings_CreatesCorrectHtml {

    @Test
    public void outerHtmlHead_GivenDocumentSettings_CreatesCorrectHtml() throws IOException {
        // given
        Document document = new Document();
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings settings = mock(Document.OutputSettings.class);

        // when
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, 0, settings);

        // then
        verify(accum).append(anyString());
    }

}
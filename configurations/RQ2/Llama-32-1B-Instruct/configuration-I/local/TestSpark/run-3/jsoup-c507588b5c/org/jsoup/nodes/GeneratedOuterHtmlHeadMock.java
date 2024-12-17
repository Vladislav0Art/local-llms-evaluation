package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadMock {

    @Test
    public void outerHtmlHeadMock() throws IOException {
        Appendable accum = new AppendableMock();
        Document.OutputSettings out = new DocumentOutputSettingsMock();

        TextNode textNode = new TextNode("Hello World");
        outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append(anyString());
    }

}
package org.jsoup.nodes;

public class GeneratedOuterHtmlTailMock {

    @Test
    public void outerHtmlTailMock() throws IOException {
        Appendable accum = new AppendableMock();
        Document.OutputSettings out = new DocumentOutputSettingsMock();

        TextNode textNode = new TextNode("Hello World");
        outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append(anyString());

        when(out.output()).thenReturn(mock(Document.OutputSettings.class).withOutputSettings(any()));
    }

}
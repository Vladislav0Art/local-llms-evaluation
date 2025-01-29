package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTailAppendableMocking {

    private static Mockito mock;

    @Test
    public void testOuterHtmlTailAppendableMocking() {
        Mockito mock = Mockito.mock(Appendable.class);
        when(mock.toString()).thenReturn(""));
        TextNode text = new TextNode("Hello World!");
        when(text.outerHtmlTail(any(Appendable.class), anyInt(), anyDocumentOutputSettings())).thenReturn(mock);
        assertEquals("", getText().outerHtmlTail(mock, 0, Document.OutputSettings.DEFAULT));
    }

}
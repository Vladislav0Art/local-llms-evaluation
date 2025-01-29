package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHeadAppendableMocking {

    private static Mockito mock;

    @Test
    public void testOuterHtmlHeadAppendableMocking() {
        Mockito mock = Mockito.mock(Appendable.class);
        when(mock.toString()).thenReturn(""));
        TextNode text = new TextNode("Hello World!");
        when(text.outerHtmlHead(any(Appendable.class), anyInt(), anyDocumentOutputSettings())).thenReturn(mock);
        assertEquals("", getText().outerHtmlHead(mock, 0, Document.OutputSettings.DEFAULT));
    }

}
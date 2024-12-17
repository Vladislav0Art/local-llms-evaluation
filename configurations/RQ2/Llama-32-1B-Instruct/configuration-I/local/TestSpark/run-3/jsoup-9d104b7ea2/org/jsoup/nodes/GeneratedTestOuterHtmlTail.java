package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private MockTextNode mockTextNode;

    @Test
    public void testOuterHtmlTail() {
        // Given
        String input = "<div>Hello</div>";

        // When
        mockTextNode.outerHtmlHead(appender, 0, Document.OutputSettings.DEFAULT);
        assertEquals("<div>Hello</div>", mockTextNode.outerHtmlTail(appender, 0, Document.OutputSettings.DEFAULT).text());

        // Then
        appender.clear();
    }

}
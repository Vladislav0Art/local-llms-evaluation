package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        Document document = mock(Document.class);
        when(document.getHtml()).thenReturn("<html><body>test</body></html>");
        Appendable output = mock(Appendable.class);
        String htmlContent = "<html><body>test</body></html>";
        when(output).append(mock(StringBuilder.class));
        when(document.outputSettings()).thenReturn(new Document.OutputSettings().setEncoding("UTF-8"));
        TextNode node = new TextNode();
        node.outerHtmlTail(output, 0, document.outputSettings());
        verify(output, times(1)).append(any(StringBuilder.class));
    }

}
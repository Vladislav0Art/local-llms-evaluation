package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = mock(Document.class);
        when(document.outputSettings()).thenReturn(new Document.OutputSettings().setEncoding("UTF-8"));
        Appendable output = mock(Appendable.class);
        String htmlContent = "<html><body>test</body></html>";
        when(output).append(mock(StringBuilder.class));
        when(document.getHtml()).thenReturn(htmlContent);
        TextNode node = new TextNode();
        node.outerHtmlHead(output, 0, document.outputSettings());
        verify(output, times(1)).append(any(StringBuilder.class));
    }

}
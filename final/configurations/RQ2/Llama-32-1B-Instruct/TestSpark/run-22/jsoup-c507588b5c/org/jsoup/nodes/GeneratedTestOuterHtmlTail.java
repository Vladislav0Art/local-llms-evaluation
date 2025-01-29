package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws Exception {
        Document document = new Document();
        Appendable accum = document.append(new StringReader("Hello World"));
        int depth = 1;
        TextNode node = new TextNode("Hello");
        document.outerHtmlHead(accum, depth, null).append().toString();
        verify(document).outerHtmlTail(accum, depth, null);
    }

}
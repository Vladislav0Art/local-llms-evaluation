package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        Document document = Mockito.mock(Document.class);
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        String outputSettings = "prettyPrint";

        Appender appender = new StringBuilderAppender();
        Assert.assertFalse(TextUtil.outerHtmlTail(appender, depth, document, outputSettings).isEmpty());
    }

}
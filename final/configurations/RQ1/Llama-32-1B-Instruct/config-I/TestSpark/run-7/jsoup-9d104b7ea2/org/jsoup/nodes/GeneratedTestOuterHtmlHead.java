package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = Mockito.mock(Document.class);
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        String outputSettings = "prettyPrint";

        Appender appender = new StringBuilderAppender();
        Assert.assertFalse(TextUtil.outerHtmlHead(appender, depth, document, outputSettings).isEmpty());
    }

}
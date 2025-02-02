package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.List;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = new StringBuilder();
        Document doc = new Document();
        Appender appender = new DocumentAppender(doc, accum, 0);
        node.outerHtmlHead(appender, 1, null); // Normalization is enabled
        System.out.println(accum.toString()); // Expected output: <p>Hello World!</p>
    }

}
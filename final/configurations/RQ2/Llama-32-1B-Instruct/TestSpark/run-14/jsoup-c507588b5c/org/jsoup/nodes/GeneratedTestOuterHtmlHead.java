package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = Document.OutputSettings.INDENT_FALSE;
        outerHtmlHead(accum, 0, out);
        assertEquals("<node>\n<text>Hello World</text>\n</node>", accum.toString());
    }

}
package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHead_GivenTextNode_AppendsOuterHTMLToAccum {

    @Test
    public void outerHtmlHead_GivenTextNode_AppendsOuterHTMLToAccum() throws IOException {
        Appendable accum = mock(Appendable.class);
        String html = "<html><body>Hello World</body></html>";
        TextNode node = new TextNode(html);
        node.outerHtmlHead(accum, 0, null);
        assertEquals(html, accum.toString());
    }

}
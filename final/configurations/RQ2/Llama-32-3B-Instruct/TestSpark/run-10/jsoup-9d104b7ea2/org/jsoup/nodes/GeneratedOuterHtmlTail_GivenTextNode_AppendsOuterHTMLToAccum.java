package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTail_GivenTextNode_AppendsOuterHTMLToAccum {

    @Test
    public void outerHtmlTail_GivenTextNode_AppendsOuterHTMLToAccum() throws IOException {
        Appendable accum = mock(Appendable.class);
        String html = "";
        TextNode node = new TextNode("");
        node.outerHtmlTail(accum, 0, null);
        assertEquals(html, accum.toString());
    }

}
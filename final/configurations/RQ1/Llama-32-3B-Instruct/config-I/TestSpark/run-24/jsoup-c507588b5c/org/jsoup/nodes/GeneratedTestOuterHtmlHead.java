package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable accum = Mockito.mock(Appendable.class);
        document.outerHtmlHead(accum, 0, "");
        assertEquals("", accum.toString());
    }

}
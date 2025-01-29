package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSetSelfClosing {

    private static final String TAG_NAME = "div";

    @Test
    public void testSetSelfClosing() {
        Tag setSelfClosing = new Tag();
        when(setSelfClosing.isSelfClosing()).thenReturn(false);
        assertNotSame(false, tag.setSelfClosing());
    }

}
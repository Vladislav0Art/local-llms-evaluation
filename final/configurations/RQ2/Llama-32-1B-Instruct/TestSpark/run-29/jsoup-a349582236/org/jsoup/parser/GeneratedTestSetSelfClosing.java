package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.mockito.Mockito;

public class GeneratedTestSetSelfClosing {

    @Test
    public void testSetSelfClosing() {
        Mockito.mock(Tag.class, "setSelfClosing");
        when(setSelfClosing()).thenReturn(true);
        Tag tag = new Tag();
        assertTrue(tag.setSelfClosing());
    }

}
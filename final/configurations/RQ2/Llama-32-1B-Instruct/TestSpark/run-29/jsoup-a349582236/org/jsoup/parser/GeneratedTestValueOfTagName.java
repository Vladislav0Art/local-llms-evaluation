package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.mockito.Mockito;

public class GeneratedTestValueOfTagName {

    @Test
    public void testValueOfTagName() {
        Mockito.mock(Tag.class, "valueOf");
        when(valueOf("tag")).thenReturn(Mockito.mock(Tag.class));
        Tag tag = new Tag();
        assertEquals(tag, (Tag) valueOf("tag"));
    }

}
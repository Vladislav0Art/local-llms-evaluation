package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.mockito.Mockito;

public class GeneratedTestValueOfTagNameNoSettings {

    @Test
    public void testValueOfTagNameNoSettings() {
        Mockito.mock(Tag.class, "valueOf");
        when(valueOf("tag")).thenReturn(Mockito.mock(Tag.class));
        Tag tag = new Tag();
        assertEquals(tag, (Tag) valueOf("tag"));
    }

}
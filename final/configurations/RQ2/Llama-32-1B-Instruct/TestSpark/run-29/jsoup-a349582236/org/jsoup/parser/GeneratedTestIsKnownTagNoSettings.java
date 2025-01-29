package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.mockito.Mockito;

public class GeneratedTestIsKnownTagNoSettings {

    @Test
    public void testIsKnownTagNoSettings() {
        Mockito.mock(Tag.class, "isKnownTag");
        when(isKnownTag("tag")).thenReturn(true);
        Tag tag = new Tag();
        assertEquals(true, tag.isKnownTag("tag"));
    }

}
package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedValueOf_UnknownTagName_ReturnsNull {

    @Test
    public void valueOf_UnknownTagName_ReturnsNull() {
        Tag tag = new Tag();
        assertNull(Tag.valueOf("unknown", Mockito.mock(ParseSettings.class)));
    }

}
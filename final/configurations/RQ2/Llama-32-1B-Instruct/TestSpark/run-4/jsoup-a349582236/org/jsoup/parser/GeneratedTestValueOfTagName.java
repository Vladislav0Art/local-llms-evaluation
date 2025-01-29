package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestValueOfTagName {

    @Test
    public void testValueOfTagName() {
        String tagName = "div";
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Tag tag = new Tag();
        Mockito.when(settings.getValue(String.class)).thenReturn(tagName);
        assertEquals(tagName, tag.valueOftagName());
    }

}
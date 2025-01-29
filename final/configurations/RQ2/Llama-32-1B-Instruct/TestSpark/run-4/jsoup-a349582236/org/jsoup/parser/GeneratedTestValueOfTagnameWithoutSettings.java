package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestValueOfTagnameWithoutSettings {

    @Test
    public void testValueOfTagnameWithoutSettings() {
        String tagName = "div";
        Parser parser = Mockito.mock(Parser.class);
        Tag tag = new Tag();
        Mockito.when(parser.getvalue(String.class)).thenReturn(tagName);
        assertEquals(tagName, tag.valueOftagName());
    }

}
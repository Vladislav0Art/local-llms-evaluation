package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetNormalName {

    @Test
    public void testGetNormalName() {
        String tagName = "div";
        Parser parser = Mockito.mock(Parser.class);
        Tag tag = new Tag();
        Mockito.when(parser.getNormalName()).thenReturn(tagName);
        assertEquals(tagName, tag.getNormalName());
    }

}
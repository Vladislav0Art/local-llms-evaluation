package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetName {

    @Test
    public void testGetName() {
        String tagName = "div";
        Parser parser = Mockito.mock(Parser.class);
        Tag tag = new Tag();
        Mockito.when(parser.getName()).thenReturn(tagName);
        assertEquals(tagName, tag.getName());
    }

}
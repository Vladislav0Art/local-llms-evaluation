package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        String tagName = "";
        Parser parser = Mockito.mock(Parser.class);
        Tag tag = new Tag();
        Mockito.when(parser.isEmpty()).thenReturn(true);
        assertFalse(tag.isEmpty());
    }

}
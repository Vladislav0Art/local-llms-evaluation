package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestPreserveWhitespace {

    @Test
    public void testPreserveWhitespace() {
        String tagName = "p";
        Parser parser = Mockito.mock(Parser.class);
        Tag tag = new Tag();
        Mockito.when(parser.preserveWhitespace()).thenReturn(true);
        assertFalse(tag.isInline());
    }

}
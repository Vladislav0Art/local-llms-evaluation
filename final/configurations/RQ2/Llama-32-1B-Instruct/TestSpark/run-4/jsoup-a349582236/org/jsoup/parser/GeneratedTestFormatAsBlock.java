package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestFormatAsBlock {

    @Test
    public void testFormatAsBlock() {
        String tagName = "span";
        Parser parser = Mockito.mock(Parser.class);
        Tag tag = new Tag();
        Mockito.when(parser.formatAsBlock()).thenReturn(true);
        assertFalse(tag.isInline());
    }

}
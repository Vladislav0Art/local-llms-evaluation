package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlock_InlineTag_ReturnsFalse {

    @Test
    public void isBlock_InlineTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

}
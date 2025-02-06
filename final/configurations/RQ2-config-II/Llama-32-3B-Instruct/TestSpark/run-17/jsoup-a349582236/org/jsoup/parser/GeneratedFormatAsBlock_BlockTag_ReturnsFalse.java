package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFormatAsBlock_BlockTag_ReturnsFalse {

    @Test
    public void formatAsBlock_BlockTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

}
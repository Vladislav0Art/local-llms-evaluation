package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag();
        boolean expectedFormatAsBlock = true;
        assertEquals(expectedFormatAsBlock, tag.formatAsBlock());
    }

}
package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag tag = new Tag();
        boolean expectedInline = true;
        assertEquals(expectedInline, tag.isInline());
    }

}
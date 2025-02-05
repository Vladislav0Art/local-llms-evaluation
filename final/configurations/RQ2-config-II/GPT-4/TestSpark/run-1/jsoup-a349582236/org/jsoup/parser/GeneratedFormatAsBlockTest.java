package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals(true, tag.formatAsBlock());
    }

}
package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.formatAsBlock());
    }

}
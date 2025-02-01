package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.formatAsBlock());
    }

}
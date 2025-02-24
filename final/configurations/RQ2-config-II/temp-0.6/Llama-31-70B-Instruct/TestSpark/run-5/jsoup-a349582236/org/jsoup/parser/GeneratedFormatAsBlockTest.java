package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFormatAsBlockTest {

    Tag tag;

    @Test
    public void formatAsBlockTest() {
        tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

}
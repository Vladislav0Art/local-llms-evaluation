package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlockTest {

    Tag tag;

    @Test
    public void isBlockTest() {
        tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

}
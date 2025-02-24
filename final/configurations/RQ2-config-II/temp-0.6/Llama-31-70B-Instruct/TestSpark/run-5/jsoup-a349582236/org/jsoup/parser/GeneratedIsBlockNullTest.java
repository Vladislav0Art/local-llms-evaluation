package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlockNullTest {

    Tag tag;

    @Test
    public void isBlockNullTest() {
        tag = Tag.valueOf(null);
        assertFalse(tag.isBlock());
    }

}
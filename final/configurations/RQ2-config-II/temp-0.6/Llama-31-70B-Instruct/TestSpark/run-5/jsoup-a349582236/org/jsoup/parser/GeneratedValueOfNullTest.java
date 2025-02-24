package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValueOfNullTest {

    Tag tag;

    @Test
    public void valueOfNullTest() {
        tag = Tag.valueOf(null);
        assertNull(tag.getName());
    }

}
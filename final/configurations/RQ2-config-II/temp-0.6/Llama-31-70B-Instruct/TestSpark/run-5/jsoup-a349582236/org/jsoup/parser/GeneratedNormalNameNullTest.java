package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNormalNameNullTest {

    Tag tag;

    @Test
    public void normalNameNullTest() {
        tag = new Tag(null);
        assertNull(tag.normalName());
    }

}
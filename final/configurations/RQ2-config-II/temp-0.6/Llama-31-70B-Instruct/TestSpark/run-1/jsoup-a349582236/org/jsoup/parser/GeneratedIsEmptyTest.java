package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.mockito.Mockito;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() throws Exception {
        Tag tag = new Tag("P");
        assertTrue(tag.isEmpty());
    }

}
package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetNameEmptyTest {

    Tag tag;

    @Test
    public void getNameEmptyTest() {
        tag = new Tag("");
        assertEquals("", tag.getName());
    }

}
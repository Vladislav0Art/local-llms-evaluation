package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("p");
        assertTrue(tag.isBlock());
    }

}
package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetNameNormalizedTest {

    @Test
    public void getNameNormalizedTest() {
        String tagName = "DIV";
        Tag tag = new Tag(tagName);

        assertEquals("div", tag.normalName());
    }

}
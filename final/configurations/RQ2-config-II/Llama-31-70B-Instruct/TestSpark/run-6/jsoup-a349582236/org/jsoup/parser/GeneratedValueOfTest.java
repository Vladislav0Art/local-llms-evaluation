package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Tag tag = Tag.valueOf("tagName", settings);
        assertNotNull(tag);
    }

}
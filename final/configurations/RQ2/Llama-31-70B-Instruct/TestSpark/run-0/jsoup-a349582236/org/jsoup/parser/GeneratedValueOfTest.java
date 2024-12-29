package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = new Tag();
        assertEquals(tag, Tag.valueOf("", null));
    }

}
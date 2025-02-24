package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedGetNameTest {

    Tag tag = new Tag();

    @Test
    public void getNameTest() {
        String expected = "div";
        String actual = tag.getName();
        assertEquals(expected, actual);
    }

}
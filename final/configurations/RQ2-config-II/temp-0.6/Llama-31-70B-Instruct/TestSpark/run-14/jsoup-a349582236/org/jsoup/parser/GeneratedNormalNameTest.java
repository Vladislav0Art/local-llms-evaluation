package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNormalNameTest {

    Tag tag = new Tag();

    @Test
    public void normalNameTest() {
        String expected = "div";
        String actual = tag.normalName();
        assertEquals(expected, actual);
    }

}
package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedValueOfTagTest {

    Tag tag = new Tag();

    @Test
    public void valueOfTagTest() {
        Tag expected = new Tag();
        Tag actual = Tag.valueOf("div");
        assertEquals(expected, actual);
    }

}
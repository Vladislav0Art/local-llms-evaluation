package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag original = new Tag("text");
        Tag clone = original.clone();
        assertNotSame(original, clone);
        assertEquals(original, clone);
    }

}
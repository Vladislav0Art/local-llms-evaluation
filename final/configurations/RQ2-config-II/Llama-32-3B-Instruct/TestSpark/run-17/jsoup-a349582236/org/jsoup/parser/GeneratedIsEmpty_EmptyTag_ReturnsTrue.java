package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsEmpty_EmptyTag_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.isEmpty());
    }

}
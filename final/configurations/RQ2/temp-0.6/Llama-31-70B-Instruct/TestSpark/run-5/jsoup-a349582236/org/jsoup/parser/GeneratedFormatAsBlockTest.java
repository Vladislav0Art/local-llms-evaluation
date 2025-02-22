package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        String tagName = "div";
        Tag tag = new Tag(tagName);

        assertTrue(tag.formatAsBlock());
    }

}
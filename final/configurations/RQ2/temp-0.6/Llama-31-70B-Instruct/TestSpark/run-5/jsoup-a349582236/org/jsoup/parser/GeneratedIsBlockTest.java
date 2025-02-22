package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        String tagName = "div";
        Tag tag = new Tag(tagName);

        assertTrue(tag.isBlock());
    }

}
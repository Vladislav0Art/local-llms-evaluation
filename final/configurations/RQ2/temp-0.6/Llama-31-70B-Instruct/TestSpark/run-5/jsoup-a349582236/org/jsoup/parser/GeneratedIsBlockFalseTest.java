package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlockFalseTest {

    @Test
    public void isBlockFalseTest() {
        String tagName = "span";
        Tag tag = new Tag(tagName);

        assertFalse(tag.isBlock());
    }

}
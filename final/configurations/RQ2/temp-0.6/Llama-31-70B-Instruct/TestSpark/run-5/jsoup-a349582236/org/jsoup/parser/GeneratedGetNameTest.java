package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        String tagName = "div";
        Tag tag = new Tag(tagName);

        assertEquals(tagName, tag.getName());
    }

}
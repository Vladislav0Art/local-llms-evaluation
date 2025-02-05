package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("tagName");
        assertNotNull(tag);
    }

}
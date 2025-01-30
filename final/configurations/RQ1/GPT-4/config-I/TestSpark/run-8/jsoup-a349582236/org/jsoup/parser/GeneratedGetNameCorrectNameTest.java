package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameCorrectNameTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void getNameCorrectNameTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

}
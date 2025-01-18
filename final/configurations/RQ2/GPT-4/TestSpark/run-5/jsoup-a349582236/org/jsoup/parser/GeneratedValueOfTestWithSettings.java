package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTestWithSettings {

    @Test
    public void valueOfTestWithSettings() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        assertEquals("div", tag.getName());
    }

}
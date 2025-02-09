package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_DefinedTagReturnsCorrectTagName {

    @Test
    public void getName_DefinedTagReturnsCorrectTagName() {
        Tag tag = new Tag();
        assertEquals("tag", tag.getName());
    }

}
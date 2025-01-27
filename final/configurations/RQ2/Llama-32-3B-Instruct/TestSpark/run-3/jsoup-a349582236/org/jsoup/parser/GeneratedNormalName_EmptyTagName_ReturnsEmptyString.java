package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_EmptyTagName_ReturnsEmptyString {

    @Test
    public void normalName_EmptyTagName_ReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.normalName());
    }

}
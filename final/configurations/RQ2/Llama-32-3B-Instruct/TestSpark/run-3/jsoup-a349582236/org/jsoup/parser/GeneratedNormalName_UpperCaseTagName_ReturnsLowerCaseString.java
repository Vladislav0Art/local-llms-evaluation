package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_UpperCaseTagName_ReturnsLowerCaseString {

    @Test
    public void normalName_UpperCaseTagName_ReturnsLowerCaseString() {
        Tag tag = new Tag();
        tag.setName("HTML");
        assertEquals("html", tag.normalName());
    }

}
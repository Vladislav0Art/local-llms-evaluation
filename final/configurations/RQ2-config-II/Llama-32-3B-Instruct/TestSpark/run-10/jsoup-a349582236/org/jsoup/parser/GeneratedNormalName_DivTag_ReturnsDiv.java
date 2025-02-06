package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_DivTag_ReturnsDiv {

    @Test
    public void normalName_DivTag_ReturnsDiv() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        assertEquals(tagName, tag.normalName());
    }

}
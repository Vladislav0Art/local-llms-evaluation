package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline {

    @Test
    public void isInline() {
        Tag inlineTag = new Tag();
        inlineTag.setName("span");
        assertTrue(inlineTag.isInline());
    }

}
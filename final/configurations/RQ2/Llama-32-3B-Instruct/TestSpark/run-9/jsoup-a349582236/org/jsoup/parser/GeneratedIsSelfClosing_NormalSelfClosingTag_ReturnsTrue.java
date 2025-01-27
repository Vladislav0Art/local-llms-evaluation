package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_NormalSelfClosingTag_ReturnsTrue {

    @Test
    public void isSelfClosing_NormalSelfClosingTag_ReturnsTrue() {
        String tagName = "img";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isSelfClosing());
    }

}
package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsSelfClosing_SelfClosingTag_ReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        String tagName = "img";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.isSelfClosing());
    }

}
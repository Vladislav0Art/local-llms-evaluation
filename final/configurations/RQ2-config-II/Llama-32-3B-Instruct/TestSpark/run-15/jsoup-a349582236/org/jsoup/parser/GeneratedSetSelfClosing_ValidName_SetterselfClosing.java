package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_ValidName_SetterselfClosing {

    @Test
    public void setSelfClosing_ValidName_SetterselfClosing() {
        String name = "img";
        Tag tagBefore = new Tag(name);
        boolean selfClosingBefore = tagBefore.isSelfClosing();
        Tag tagAfter = tagBefore.setSelfClosing();
        assertTrue(tagAfter.isSelfClosing());
    }

}
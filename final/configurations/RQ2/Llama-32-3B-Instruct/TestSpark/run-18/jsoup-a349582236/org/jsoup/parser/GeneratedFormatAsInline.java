package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsInline {

    @Test
    public void formatAsInline() {
        Tag inlineTag = new Tag();
        inlineTag.setName("span");
        assertFalse(inlineTag.formatAsBlock());
    }

}
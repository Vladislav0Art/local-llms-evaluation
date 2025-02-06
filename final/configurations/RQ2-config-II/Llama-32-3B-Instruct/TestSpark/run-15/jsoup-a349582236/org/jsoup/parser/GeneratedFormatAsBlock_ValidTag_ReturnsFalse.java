package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_ValidTag_ReturnsFalse {

    @Test
    public void formatAsBlock_ValidTag_ReturnsFalse() {
        String name = "span";
        Tag tag = new Tag(name);
        assertFalse(tag.formatAsBlock());
    }

}
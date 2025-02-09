package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_FormTag_ReturnsTrue {

    @Test
    public void formatAsBlock_FormTag_ReturnsTrue() {
        Tag tag = new Tag("div");
        assertTrue(tag.formatAsBlock());
    }

}
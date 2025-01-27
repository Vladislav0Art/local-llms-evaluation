package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_TagIsBlockAndStyleNotEmpty_ReturnsTrue {

    @Test
    public void formatAsBlock_TagIsBlockAndStyleNotEmpty_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("div");
        assertTrue(tag.formatAsBlock());
    }

}
package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_ReturnsTrueForBlockTags {

    @Test
    public void formatAsBlock_ReturnsTrueForBlockTags() {
        Tag tag = new Tag("h1");
        assertTrue(tag.formatAsBlock());
    }

}
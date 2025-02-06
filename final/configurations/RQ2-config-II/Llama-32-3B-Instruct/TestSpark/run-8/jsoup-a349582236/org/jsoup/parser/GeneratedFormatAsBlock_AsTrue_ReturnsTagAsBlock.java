package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.Tag;

public class GeneratedFormatAsBlock_AsTrue_ReturnsTagAsBlock {

    @Test
    public void formatAsBlock_AsTrue_ReturnsTagAsBlock() {
        Tag tag = new Tag("div");
        tag.setFormatAsBlock(true);
        assertTrue(tag.formatAsBlock());
    }

}
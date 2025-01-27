package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class GeneratedFormatAsBlock {

    @Test
    public void formatAsBlock() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
        tag.setSelfClosing();
        assertTrue(tag.formatAsBlock());
    }

}
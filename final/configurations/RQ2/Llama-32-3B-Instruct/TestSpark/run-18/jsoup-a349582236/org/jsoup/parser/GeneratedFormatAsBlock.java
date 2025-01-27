package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock {

    @Test
    public void formatAsBlock() {
        Tag blockTag = new Tag();
        blockTag.setName("div");
        assertTrue(blockTag.formatAsBlock());
    }

}
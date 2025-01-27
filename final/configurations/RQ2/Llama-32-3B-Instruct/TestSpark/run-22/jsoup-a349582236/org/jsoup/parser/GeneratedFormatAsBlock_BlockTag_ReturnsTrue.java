package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_BlockTag_ReturnsTrue {

    @Test
    public void formatAsBlock_BlockTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("p");
        assertTrue(tag.formatAsBlock());
    }

}
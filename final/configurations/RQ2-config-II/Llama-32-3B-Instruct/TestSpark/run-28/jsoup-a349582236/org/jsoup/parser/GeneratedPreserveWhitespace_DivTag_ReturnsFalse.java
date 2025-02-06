package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_DivTag_ReturnsFalse {

    @Test
    public void preserveWhitespace_DivTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("div");
        assertFalse(tag.preserveWhitespace());
    }

}
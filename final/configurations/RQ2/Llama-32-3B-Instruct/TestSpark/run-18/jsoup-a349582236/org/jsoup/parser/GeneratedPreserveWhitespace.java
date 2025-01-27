package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace {

    @Test
    public void preserveWhitespace() {
        Tag tag = new Tag();
        tag.setName("span");
        assertTrue(tag.preserveWhitespace());
    }

}
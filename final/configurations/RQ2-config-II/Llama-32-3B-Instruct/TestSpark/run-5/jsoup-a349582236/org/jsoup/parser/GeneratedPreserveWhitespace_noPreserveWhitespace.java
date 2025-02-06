package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_noPreserveWhitespace {

    @Test
    public void preserveWhitespace_noPreserveWhitespace() {
        Tag tag = new Tag();
        assertFalse(tag.preserveWhitespace());
    }

}
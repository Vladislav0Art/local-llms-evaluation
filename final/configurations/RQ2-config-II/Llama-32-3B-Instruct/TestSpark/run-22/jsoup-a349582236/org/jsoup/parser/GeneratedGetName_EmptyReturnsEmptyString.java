package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_EmptyReturnsEmptyString {

    @Test
    public void getName_EmptyReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

}
package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_noSpace {

    @Test
    public void normalName_noSpace() {
        Tag tag = new Tag("tag");
        assertEquals("tag", tag.normalName());
    }

}
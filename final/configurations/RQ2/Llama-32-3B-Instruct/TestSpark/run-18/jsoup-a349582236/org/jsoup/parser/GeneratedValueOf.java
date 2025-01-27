package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf {

    @Test
    public void valueOf() {
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf("p", settings);
        assertNotNull(tag);
    }

}
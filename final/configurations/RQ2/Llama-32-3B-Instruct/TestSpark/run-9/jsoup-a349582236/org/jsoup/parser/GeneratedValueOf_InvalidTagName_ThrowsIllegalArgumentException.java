package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_InvalidTagName_ThrowsIllegalArgumentException {

    @Test
    public void valueOf_InvalidTagName_ThrowsIllegalArgumentException() {
        String tagName = "invalid";
        ParseSettings settings = new ParseSettings(false, false); // Pass default values
        Tag.valueOf(tagName, settings);
    }

}
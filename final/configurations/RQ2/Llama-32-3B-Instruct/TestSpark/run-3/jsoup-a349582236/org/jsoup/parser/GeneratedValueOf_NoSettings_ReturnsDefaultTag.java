package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_NoSettings_ReturnsDefaultTag {

    @Test
    public void valueOf_NoSettings_ReturnsDefaultTag() {
        ParseSettings settings = null;
        Tag tag = Tag.valueOf("tag");
        assertNotNull(tag);
    }

}
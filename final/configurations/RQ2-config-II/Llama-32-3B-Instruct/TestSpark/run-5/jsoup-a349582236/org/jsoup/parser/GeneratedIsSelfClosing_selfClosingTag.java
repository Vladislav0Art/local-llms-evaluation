package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_selfClosingTag {

    @Test
    public void isSelfClosing_selfClosingTag() {
        Tag tag = new Tag("img");
        assertTrue(tag.isSelfClosing());
    }

}
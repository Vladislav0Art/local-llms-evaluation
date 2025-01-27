package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_SelfClosingTags_ReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTags_ReturnsTrue() {
        String tagName = "img";
        assertTrue(Tag.isSelfClosing(tagName));
    }

}
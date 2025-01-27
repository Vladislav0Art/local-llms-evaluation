package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_NonSelfClosingTags_ReturnsFalse {

    @Test
    public void isSelfClosing_NonSelfClosingTags_ReturnsFalse() {
        String tagName = "div";
        assertFalse(Tag.isSelfClosing(tagName));
    }

}
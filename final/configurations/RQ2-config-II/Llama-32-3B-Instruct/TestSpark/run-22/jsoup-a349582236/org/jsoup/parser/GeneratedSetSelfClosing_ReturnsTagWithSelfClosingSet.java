package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_ReturnsTagWithSelfClosingSet {

    @Test
    public void setSelfClosing_ReturnsTagWithSelfClosingSet() {
        Tag tag = new Tag();
        Tag result = tag.setSelfClosing();
        assertTrue(result.isSelfClosing());
    }

}
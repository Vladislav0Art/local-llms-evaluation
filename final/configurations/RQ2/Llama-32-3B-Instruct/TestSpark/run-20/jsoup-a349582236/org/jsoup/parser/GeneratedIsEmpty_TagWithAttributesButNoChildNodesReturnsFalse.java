package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsEmpty_TagWithAttributesButNoChildNodesReturnsFalse {

    @Test
    public void isEmpty_TagWithAttributesButNoChildNodesReturnsFalse() {
        assertFalse(Tag.isEmpty("<tag attr>"));
    }

}
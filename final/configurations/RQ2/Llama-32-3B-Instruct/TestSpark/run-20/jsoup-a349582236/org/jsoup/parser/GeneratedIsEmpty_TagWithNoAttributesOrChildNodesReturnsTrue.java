package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsEmpty_TagWithNoAttributesOrChildNodesReturnsTrue {

    @Test
    public void isEmpty_TagWithNoAttributesOrChildNodesReturnsTrue() {
        assertTrue(Tag.isEmpty("<tag>"));
    }

}
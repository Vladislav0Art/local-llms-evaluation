package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedValueOf_EmptyString_ReturnsNewGenericTag {

    @Test
    public void valueOf_EmptyString_ReturnsNewGenericTag() {
        Tag actual = Tag.valueOf("", null);
        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

}
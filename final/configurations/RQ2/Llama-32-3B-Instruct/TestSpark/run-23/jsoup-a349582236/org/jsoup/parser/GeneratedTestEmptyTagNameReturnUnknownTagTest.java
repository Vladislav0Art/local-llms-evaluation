package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestEmptyTagNameReturnUnknownTagTest {

    @Test
    public void testEmptyTagNameReturnUnknownTagTest() {
        Tag tag = Tag.valueOf("");
        assertTrue(!tag.isKnownTag());
    }

}
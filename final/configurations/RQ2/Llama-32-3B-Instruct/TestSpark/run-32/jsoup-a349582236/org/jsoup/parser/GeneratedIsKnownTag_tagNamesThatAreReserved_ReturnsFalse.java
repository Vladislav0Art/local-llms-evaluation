package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsKnownTag_tagNamesThatAreReserved_ReturnsFalse {

    @Test
    public void isKnownTag_tagNamesThatAreReserved_ReturnsFalse() throws Exception {
        String tagName = "script";
        assertFalse(Tag.isKnownTag(tagName));
    }

}
package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_ReturnsTrueIfNotBlockAndNoSelfClosing {

    @Test
    public void isInline_ReturnsTrueIfNotBlockAndNoSelfClosing() {
        Tag tag = new Tag();
        tag.setSelfClosing(false);
        assertTrue(tag.isInline());
    }

}
package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_DefaultReturnFalse {

    @Test
    public void preserveWhitespace_DefaultReturnFalse() {
        Tag tag = new Tag();
        assertFalse(tag.preserveWhitespace());
    }

}
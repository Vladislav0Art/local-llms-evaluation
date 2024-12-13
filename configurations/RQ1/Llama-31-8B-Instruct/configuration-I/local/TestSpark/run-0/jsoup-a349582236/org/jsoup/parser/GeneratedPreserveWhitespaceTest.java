package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespaceTest {

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("pre");
        assertTrue(tag.preserveWhitespace());
    }

}
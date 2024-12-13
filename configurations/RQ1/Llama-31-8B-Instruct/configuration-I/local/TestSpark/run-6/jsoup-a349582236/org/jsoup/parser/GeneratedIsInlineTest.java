package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedIsInlineTest {

    private Tag tag;

    @Test
    public void isInlineTest() {
        tag = new Tag("span");
        assertTrue(tag.isInline());
    }

}
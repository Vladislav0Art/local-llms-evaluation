package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestValueOf {

    private Tag tag;
    private static final String TAG_NAME = "div";
    private static final String NORMAL_NAME = "div";

    @Before
    public void setUp() {
        tag = new Tag(TAG_NAME);
    }

    @Test
    public void testValueOf() {
        Tag tag = Tag.valueOf(TAG_NAME, ParseSettings.preserveCase);
        assertEquals(NORMAL_NAME, tag.normalName());
    }

}
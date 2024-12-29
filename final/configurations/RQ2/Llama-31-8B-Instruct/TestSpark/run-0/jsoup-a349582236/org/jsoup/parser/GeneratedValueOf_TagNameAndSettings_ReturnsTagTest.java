package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf_TagNameAndSettings_ReturnsTagTest {

    @Test
    public void valueOf_TagNameAndSettings_ReturnsTagTest() {
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf("div", settings);
        assertEquals("div", tag.getName());
    }

}
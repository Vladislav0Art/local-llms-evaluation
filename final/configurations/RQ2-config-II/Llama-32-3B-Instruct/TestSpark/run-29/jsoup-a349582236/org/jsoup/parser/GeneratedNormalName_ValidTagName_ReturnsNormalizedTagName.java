package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_ValidTagName_ReturnsNormalizedTagName {

    @Mock
    private ParseSettings settings;

    @Test
    public void normalName_ValidTagName_ReturnsNormalizedTagName() {
        String tagName = "<p>";
        Tag tag = new Tag(tagName);
        assertEquals("p", tag.normalName());
    }

}
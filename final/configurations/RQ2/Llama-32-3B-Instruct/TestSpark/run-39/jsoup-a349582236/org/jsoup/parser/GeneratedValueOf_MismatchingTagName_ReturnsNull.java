package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf_MismatchingTagName_ReturnsNull {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void valueOf_MismatchingTagName_ReturnsNull() {
        String tagName = "some";
        ParseSettings settings = parseSettings;
        Tag expectedTag = null;
        assertEquals(expectedTag, Tag.valueOf(tagName, settings));
    }

}
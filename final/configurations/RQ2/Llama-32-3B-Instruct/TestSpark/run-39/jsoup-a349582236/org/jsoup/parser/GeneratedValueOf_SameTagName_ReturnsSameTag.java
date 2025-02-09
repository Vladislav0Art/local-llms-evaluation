package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf_SameTagName_ReturnsSameTag {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void valueOf_SameTagName_ReturnsSameTag() {
        String tagName = "some";
        ParseSettings settings = parseSettings;
        Tag expectedTag = new Tag();
        expectedTag.setName(tagName);
        assertTrue(Tag.valueOf(tagName, settings).equals(expectedTag));
    }

}
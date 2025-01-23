package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValueOf_TagNameAndSettings_ReturnsTag {

    public static class TagImpl extends Tag {
        public TagImpl(String name) {
            super(name);
        }
    }

    @Test
    public void valueOf_TagNameAndSettings_ReturnsTag() {
        ParseSettings settings = mock(ParseSettings.class);
        Tag tag = Tag.valueOf("div", settings);
        assertNotNull(tag);
    }

}
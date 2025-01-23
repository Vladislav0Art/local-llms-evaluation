package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    public static class TagImpl extends Tag {
        public TagImpl(String name) {
            super(name, null);
        }
    }

    @Test
    public void getName_ReturnsEmptyString_WhenTagIsNull() {
        Tag tag = null;
        assertNull(tag.getName());
    }

    @Test
    public void normalName_ReturnsEmptyString_WhenTagIsNull() {
        Tag tag = null;
        assertNull(tag.normalName());
    }

    @Test
    public void valueOf_TagNameAndSettings_ReturnsTag() {
        ParseSettings settings = mock(ParseSettings.class);
        Tag tag = Tag.valueOf("div", settings);
        assertNotNull(tag);
    }

    @Test
    public void valueOf_TagName_ReturnsTag() {
        Tag tag = Tag.valueOf("div");
        assertNotNull(tag);
    }

}
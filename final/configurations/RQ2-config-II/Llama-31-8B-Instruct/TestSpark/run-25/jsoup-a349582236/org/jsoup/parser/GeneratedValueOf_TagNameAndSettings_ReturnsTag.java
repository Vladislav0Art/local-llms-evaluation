package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf_TagNameAndSettings_ReturnsTag {

    @Test
    public void valueOf_TagNameAndSettings_ReturnsTag() {
        Tag tag = Tag.valueOf("div", new ParseSettings());
        assertNotNull(tag);
    }

}
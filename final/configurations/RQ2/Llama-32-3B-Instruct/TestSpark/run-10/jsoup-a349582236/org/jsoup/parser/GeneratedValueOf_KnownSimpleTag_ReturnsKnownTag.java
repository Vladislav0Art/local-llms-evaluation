package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf_KnownSimpleTag_ReturnsKnownTag {

    @Mock
    private ParseSettings settings;

    @Test
    public void valueOf_KnownSimpleTag_ReturnsKnownTag() {
        Tag tag = Tag.valueOf("tag");
        assertTrue(Tag.isKnownTag(tag));
    }

}
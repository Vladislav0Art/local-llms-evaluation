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
public class GeneratedValueOf_SimpleTag_ReturnsCreatedTag {

    @Mock
    private ParseSettings settings;

    @Test
    public void valueOf_SimpleTag_ReturnsCreatedTag() {
        Tag tag = Tag.valueOf("tag");
        assertNotNull(tag);
        assertEquals("tag", tag.getName());
    }

}
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
public class GeneratedNormalName_SimpleTag_ReturnsOriginalTagName {

    @Mock
    private ParseSettings settings;

    @Test
    public void normalName_SimpleTag_ReturnsOriginalTagName() {
        Tag tag = new Tag();
        tag.setName("tag");
        assertEquals("tag", tag.normalName());
    }

}
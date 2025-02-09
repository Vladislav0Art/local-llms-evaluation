package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPreserveWhitespace_WithEmptyTagName_ReturnsDefault {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void preserveWhitespace_WithEmptyTagName_ReturnsDefault() {
        String tagName = "";
        Mockito.when(parseSettings.getTagName()).thenReturn(tagName);
        org.jsoup.parser.Tag tag = Tag.valueOf(tagName, parseSettings);
        org.junit.Assert.assertFalse(tag.preserveWhitespace());
    }

}
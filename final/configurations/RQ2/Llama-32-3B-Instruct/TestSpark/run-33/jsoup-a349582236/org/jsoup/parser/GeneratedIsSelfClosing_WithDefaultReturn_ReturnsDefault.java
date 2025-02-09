package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSelfClosing_WithDefaultReturn_ReturnsDefault {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void isSelfClosing_WithDefaultReturn_ReturnsDefault() {
        String tagName = "img";
        Mockito.when(parseSettings.getTagName()).thenReturn(tagName);
        org.jsoup.parser.Tag tag = Tag.valueOf(tagName, parseSettings);
        org.junit.Assert.assertFalse(tag.isSelfClosing());
    }

}
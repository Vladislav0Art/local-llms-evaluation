package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetSelfClosing_ValidTagName_ReturnsNewTag {

    @Mock
    private ParseSettings settings;

    @Mock
    private String tagName;

    @Test
    public void setSelfClosing_ValidTagName_ReturnsNewTag() {
        when(settings.setSelfClosing(tagName)).thenReturn(true);
        Tag newTag = new Tag(settings);
        assertTrue(newTag.isSelfClosing());
    }

}
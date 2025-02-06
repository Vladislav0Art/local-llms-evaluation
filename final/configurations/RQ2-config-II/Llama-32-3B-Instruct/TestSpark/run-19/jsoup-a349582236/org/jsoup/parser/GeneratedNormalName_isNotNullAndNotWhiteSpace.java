package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_isNotNullAndNotWhiteSpace {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void normalName_isNotNullAndNotWhiteSpace() {
        when(parseSettings.getName()).thenReturn("div");
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName, parseSettings);
        assertEquals(Normalizer.normalise(tagName), tag.normalName());
    }

}
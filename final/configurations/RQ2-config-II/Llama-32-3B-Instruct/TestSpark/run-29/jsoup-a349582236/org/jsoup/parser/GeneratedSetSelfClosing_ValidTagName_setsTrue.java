package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetSelfClosing_ValidTagName_setsTrue {

    @Mock
    private ParseSettings settings;

    @Test
    public void setSelfClosing_ValidTagName_setsTrue() {
        String tagName = "img";
        Tag expectedTag = new Tag(tagName);
        expectedTag.setSelfClosing();
        Tag actualTag = new Tag(tagName);
        assertEquals(expectedTag, actualTag.setSelfClosing());
    }

}
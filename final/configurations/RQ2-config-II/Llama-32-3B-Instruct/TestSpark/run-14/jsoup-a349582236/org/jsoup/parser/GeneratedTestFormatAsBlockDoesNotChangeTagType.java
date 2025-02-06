package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestFormatAsBlockDoesNotChangeTagType {

    @Mock
    private ParseSettings parseSettings;

    public TagTest() {
        when(parseSettings.getNamespace()).thenReturn("http://www.w3.org/1999/xhtml");
    }

    @Test
    public void testFormatAsBlockDoesNotChangeTagType() {
        String name = "div";
        when(parseSettings.getNamespace()).thenReturn(name);
        Tag tag = Tag.valueOf(name, parseSettings);
        assertFalse(tag.formatAsBlock());
    }

}
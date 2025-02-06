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
public class GeneratedFormatAsBlock_ValidTagName_returnsFalse {

    @Mock
    private ParseSettings settings;

    @Test
    public void formatAsBlock_ValidTagName_returnsFalse() {
        String tagName = "span";
        Tag tag = new Tag(tagName);
        assertFalse(tag.formatAsBlock());
    }

}
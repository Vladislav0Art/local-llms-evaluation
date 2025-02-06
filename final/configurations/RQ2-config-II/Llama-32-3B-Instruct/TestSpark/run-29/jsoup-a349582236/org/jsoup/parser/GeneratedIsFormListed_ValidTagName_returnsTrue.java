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
public class GeneratedIsFormListed_ValidTagName_returnsTrue {

    @Mock
    private ParseSettings settings;

    @Test
    public void isFormListed_ValidTagName_returnsTrue() {
        String tagName = "form";
        Tag tag = new Tag(tagName);
        assertTrue(tag.isFormListed());
    }

}
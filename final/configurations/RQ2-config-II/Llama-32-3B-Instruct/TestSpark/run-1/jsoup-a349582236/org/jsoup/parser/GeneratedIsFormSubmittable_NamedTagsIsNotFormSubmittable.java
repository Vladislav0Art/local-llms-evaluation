package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsFormSubmittable_NamedTagsIsNotFormSubmittable {

    @Mock
    private ParseSettings settings;

    public TagTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isFormSubmittable_NamedTagsIsNotFormSubmittable() {
        // [isFormSubmittable][NamedTag]Test
        String tagName1 = "div";
        when(settings.getNames()).thenReturn(new HashMap<>());
        Tag tag1 = new Tag(tagName1, settings);
        assertFalse(tag1.isFormSubmittable());
    }

}
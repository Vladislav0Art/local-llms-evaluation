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
public class GeneratedNormalName_InvalidName_ReturnsNormalizedName {

    @Mock
    private ParseSettings settings;

    public TagTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void normalName_InvalidName_ReturnsNormalizedName() {
        // [normalName][InvalidName]Test
        String name = "!";
        Tag tag = new Tag(name, settings);
        assertEquals(Validate.NORMALIZE, tag.normalName());
    }

}
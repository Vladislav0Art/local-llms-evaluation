package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_ReturnsNormalizedName_ReturnsNormalizedName {

    @Test
    public void normalName_ReturnsNormalizedName_ReturnsNormalizedName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.normalName());
    }

}
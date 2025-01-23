package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNormalName_ReturnsNormalizedName {

    @Test
    public void normalName_ReturnsNormalizedName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.normalName());
    }

}
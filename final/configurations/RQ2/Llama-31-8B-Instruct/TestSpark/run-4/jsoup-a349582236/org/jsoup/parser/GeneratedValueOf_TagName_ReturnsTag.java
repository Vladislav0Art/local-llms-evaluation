package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValueOf_TagName_ReturnsTag {

    @Test
    public void valueOf_TagName_ReturnsTag() {
        Tag tag = Tag.valueOf("div");
        assertNotNull(tag);
    }

}
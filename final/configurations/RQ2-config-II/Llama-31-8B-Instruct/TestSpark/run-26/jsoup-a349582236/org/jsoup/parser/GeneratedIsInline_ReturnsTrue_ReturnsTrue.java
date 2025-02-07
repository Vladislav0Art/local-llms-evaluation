package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInline_ReturnsTrue_ReturnsTrue {

    @Test
    public void isInline_ReturnsTrue_ReturnsTrue() {
        Tag tag = new Tag("span");
        assertTrue(tag.isInline());
    }

}
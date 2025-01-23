package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsInline_ReturnsFalse_WhenTagIsNotInline {

    @Test
    public void isInline_ReturnsFalse_WhenTagIsNotInline() {
        Tag tag = new TagImpl("p");
        assertFalse(tag.isInline());
    }

}
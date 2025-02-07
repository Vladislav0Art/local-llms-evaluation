package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetName_ReturnsNull_ThrowsNullPointerException {

    @Test
    public void getName_ReturnsNull_ThrowsNullPointerException() {
        Tag tag = null;
        try {
            tag.getName();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}
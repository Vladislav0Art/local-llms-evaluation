package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFormatAsBlock_ReturnsFalse_ReturnsFalse {

    @Test
    public void formatAsBlock_ReturnsFalse_ReturnsFalse() {
        Tag tag = new Tag("span");
        assertFalse(tag.formatAsBlock());
    }

}
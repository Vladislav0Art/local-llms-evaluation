package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_NonSelfClosingTagsReturnTrue {

    @Test
    public void isInline_NonSelfClosingTagsReturnTrue() {
        // Arrange and Act
        String tagName = "div";
        assertTrue(new Tag(tagName).isInline());
    }

}
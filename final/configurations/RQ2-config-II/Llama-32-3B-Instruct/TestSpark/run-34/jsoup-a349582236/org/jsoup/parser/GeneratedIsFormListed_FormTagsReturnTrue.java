package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsFormListed_FormTagsReturnTrue {

    @Test
    public void isFormListed_FormTagsReturnTrue() {
        // Arrange and Act
        String tagName = "input";
        assertTrue(new Tag(tagName).isFormListed());
    }

}
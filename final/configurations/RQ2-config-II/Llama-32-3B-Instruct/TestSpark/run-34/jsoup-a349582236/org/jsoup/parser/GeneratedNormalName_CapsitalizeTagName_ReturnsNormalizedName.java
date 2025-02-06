package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_CapsitalizeTagName_ReturnsNormalizedName {

    @Test
    public void normalName_CapsitalizeTagName_ReturnsNormalizedName() {
        // Arrange and Act
        String tagName = "testTag";
        String expectedName = Normalizer.capsitalize(tagName);

        // Assert
        assertEquals(expectedName, new Tag(tagName).normalName());
    }

}
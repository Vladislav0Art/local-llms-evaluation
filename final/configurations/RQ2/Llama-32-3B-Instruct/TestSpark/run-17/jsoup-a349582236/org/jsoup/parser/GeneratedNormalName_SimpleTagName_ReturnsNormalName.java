package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_SimpleTagName_ReturnsNormalName {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void normalName_SimpleTagName_ReturnsNormalName() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("div");

        // Act and Assert
        String normalName = Tag.normalName();
        assertEquals("div", normalName, "Simple tagName");
    }

}
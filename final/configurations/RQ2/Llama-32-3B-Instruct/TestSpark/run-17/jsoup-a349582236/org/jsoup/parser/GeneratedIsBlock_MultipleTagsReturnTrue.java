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
public class GeneratedIsBlock_MultipleTagsReturnTrue {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void isBlock_MultipleTagsReturnTrue() {
        // Arrange
        when(parseSettings.getTagName()).thenReturn("p");

        // Act and Assert
        boolean isBlock = Tag.isBlock();
        assertTrue(isBlock, "Multiple tags are block");
    }

}
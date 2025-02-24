package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValueOfWithSettingsTest {

    @Test
    public void valueOfWithSettingsTest() {
        //Arrange
        Tag tag = new Tag();
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag expectedTag = new Tag();

        //Act
        Tag actualTag = tag.valueOf(tagName, settings);

        //Assert
        assertEquals(expectedTag, actualTag);
    }

}
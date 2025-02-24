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

public class GeneratedTest {

    @Test
    public void getNameTest() {
        //Arrange
        Tag tag = new Tag();
        String expectedName = "div";

        //Act
        String actualName = tag.getName();

        //Assert
        assertEquals(expectedName, actualName);
    }

    @Test
    public void normalNameTest() {
        //Arrange
        Tag tag = new Tag();
        String expectedNormalName = "DIV";

        //Act
        String actualNormalName = tag.normalName();

        //Assert
        assertEquals(expectedNormalName, actualNormalName);
    }

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

    @Test
    public void valueOfTest() {
        //Arrange
        Tag tag = new Tag();
        String tagName = "div";
        Tag expectedTag = new Tag();

        //Act
        Tag actualTag = tag.valueOf(tagName);

        //Assert
        assertEquals(expectedTag, actualTag);
    }

}
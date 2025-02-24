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

public class GeneratedNormalNameTest {

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

}
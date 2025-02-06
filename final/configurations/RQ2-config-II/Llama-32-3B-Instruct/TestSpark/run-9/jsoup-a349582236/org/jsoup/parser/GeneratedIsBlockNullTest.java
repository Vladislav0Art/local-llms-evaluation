package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlockNullTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void isBlockNullTest() {
        //Arrange
        Tag tag = null;

        //Act & Assert
        org.junit.Assert.assertTrue(tag.isBlock());
    }

}
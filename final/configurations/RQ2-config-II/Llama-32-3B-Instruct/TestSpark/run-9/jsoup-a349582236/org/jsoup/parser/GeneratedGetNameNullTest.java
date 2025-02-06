package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetNameNullTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void getNameNullTest() {
        //Arrange
        Tag tag = new Tag();
        String tagName = null;

        //Act & Assert
        org.junit.Assert.assertNull(tag.getName());
    }

}
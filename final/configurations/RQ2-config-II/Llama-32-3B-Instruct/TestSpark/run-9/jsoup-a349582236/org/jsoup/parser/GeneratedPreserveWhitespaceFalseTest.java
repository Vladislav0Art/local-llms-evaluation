package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPreserveWhitespaceFalseTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void preserveWhitespaceFalseTest() {
        //Arrange
        Tag tag = new Tag();

        //Act & Assert
        org.junit.Assert.assertFalse(tag.preserveWhitespace());
    }

}
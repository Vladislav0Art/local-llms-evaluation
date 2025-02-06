package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetNameReturnsTagName {

    @Test
    public void getNameReturnsTagName() {
        // Arrange
        String tagName = "test";
        when(Tag.valueOf(tagName).getName()).thenReturn(tagName);

        // Act
        String result = Tag.valueOf(tagName).getName();

        // Assert
        assertThat(result, is(tagName));
    }

}
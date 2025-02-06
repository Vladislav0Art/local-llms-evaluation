package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalNameReturnsNormalizedTagName {

    @Test
    public void normalNameReturnsNormalizedTagName() {
        // Arrange
        String tagName = "test";
        when(Tag.valueOf(tagName)).thenReturn(new Tag(tagName));

        // Act
        String result = Tag.valueOf(tagName).normalName();

        // Assert
        assertThat(result, is("test"));
    }

}
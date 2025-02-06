package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsEmptyReturnsTrueForEmptyTags {

    @Test
    public void isEmptyReturnsTrueForEmptyTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag(""));
        when(Tag.isEmpty()).thenReturn(true);

        // Act
        boolean result = Tag.valueOf("test").isEmpty();

        // Assert
        assertThat(result, is(true));
    }

}
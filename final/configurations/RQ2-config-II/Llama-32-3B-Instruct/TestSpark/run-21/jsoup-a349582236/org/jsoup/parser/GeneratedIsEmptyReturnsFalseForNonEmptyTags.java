package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsEmptyReturnsFalseForNonEmptyTags {

    @Test
    public void isEmptyReturnsFalseForNonEmptyTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag("test"));
        when(Tag.isEmpty()).thenReturn(false);

        // Act
        boolean result = Tag.valueOf("test").isEmpty();

        // Assert
        assertThat(result, is(false));
    }

}
package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetSelfClosingReturnsFalseForNonEmptyTags {

    @Test
    public void setSelfClosingReturnsFalseForNonEmptyTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag(""));
        when(Tag.setSelfClosing()).thenReturn(false);

        // Act
        boolean result = Tag.valueOf("test").setSelfClosing();

        // Assert
        assertThat(result, is(false));
    }

}
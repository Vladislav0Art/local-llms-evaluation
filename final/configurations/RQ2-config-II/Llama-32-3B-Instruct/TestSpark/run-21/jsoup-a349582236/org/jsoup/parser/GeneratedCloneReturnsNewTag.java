package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneReturnsNewTag {

    @Test
    public void cloneReturnsNewTag() {
        // Arrange
        Tag tag = new Tag("test");
        when(Tag.clone()).thenReturn(tag);

        // Act
        Tag result = Tag.clone();

        // Assert
        assertThat(result, is(tag));
    }

}
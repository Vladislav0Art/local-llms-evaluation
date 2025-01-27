package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateElementReturnCorrectElementWithMock {

    @Test
    public void createElementReturnCorrectElementWithMock() {
        // Given
        String expectedTagName = "div";
        Connection connection = mock(Connection.class);
        when(connection.get()).thenReturn("http://example.com");
        Document document = Jsoup.connect(connection).get();

        // When
        Element actualElement = document.createElement(expectedTagName);

        // Then
        assertThat(actualElement.tagName(), is(expectedTagName));
    }

}
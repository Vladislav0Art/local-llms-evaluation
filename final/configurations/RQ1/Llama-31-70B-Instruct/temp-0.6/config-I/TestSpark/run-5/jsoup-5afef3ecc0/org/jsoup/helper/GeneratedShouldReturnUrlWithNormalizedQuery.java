package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldReturnUrlWithNormalizedQuery {

    @Test
    public void shouldReturnUrlWithNormalizedQuery() throws Exception {
        // given
        URL inputUrl = new URL("http://www.example.com/path/to/file.html?key1=value1&key2=value2");

        // when
        URL result = new UrlBuilder(inputUrl).build();

        // then
        assertEquals("http://www.example.com/path/to/file.html?key1=value1&key2=value2", result.toString());
    }

}
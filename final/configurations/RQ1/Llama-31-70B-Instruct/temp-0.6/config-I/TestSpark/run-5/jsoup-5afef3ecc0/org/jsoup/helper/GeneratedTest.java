package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void shouldReturnUrlWithDecodedHost() throws Exception {
        // given
        URL inputUrl = new URL("http://www.example.com%2F%2F%2F");

        // when
        URL result = new UrlBuilder(inputUrl).build();

        // then
        assertEquals("http://www.example.com///", result.toString());
    }

    @Test
    public void shouldReturnUrlWithDecodedPath() throws Exception {
        // given
        URL inputUrl = new URL("http://www.example.com/path%2Fto%2Ffile.html");

        // when
        URL result = new UrlBuilder(inputUrl).build();

        // then
        assertEquals("http://www.example.com/path/to/file.html", result.toString());
    }

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
package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldReturnUrlWithDecodedPath {

    @Test
    public void shouldReturnUrlWithDecodedPath() throws Exception {
        // given
        URL inputUrl = new URL("http://www.example.com/path%2Fto%2Ffile.html");

        // when
        URL result = new UrlBuilder(inputUrl).build();

        // then
        assertEquals("http://www.example.com/path/to/file.html", result.toString());
    }

}
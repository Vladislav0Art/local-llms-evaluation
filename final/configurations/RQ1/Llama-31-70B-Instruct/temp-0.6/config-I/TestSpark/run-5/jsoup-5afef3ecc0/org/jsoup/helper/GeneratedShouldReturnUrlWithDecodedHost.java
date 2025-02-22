package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldReturnUrlWithDecodedHost {

    @Test
    public void shouldReturnUrlWithDecodedHost() throws Exception {
        // given
        URL inputUrl = new URL("http://www.example.com%2F%2F%2F");

        // when
        URL result = new UrlBuilder(inputUrl).build();

        // then
        assertEquals("http://www.example.com///", result.toString());
    }

}
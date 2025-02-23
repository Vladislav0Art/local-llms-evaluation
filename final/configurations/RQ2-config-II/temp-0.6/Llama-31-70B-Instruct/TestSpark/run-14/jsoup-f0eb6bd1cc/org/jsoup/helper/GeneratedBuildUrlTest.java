package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import java.net.URL;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws Exception {
        // Given
        URL inputUrl = new URL("http://example.com/path?key1=value1&key2=value2#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL result = urlBuilder.build();

        // Then
        assertEquals("http://example.com/path?key1=value1&key2=value2#anchor", result.toString());
    }

}
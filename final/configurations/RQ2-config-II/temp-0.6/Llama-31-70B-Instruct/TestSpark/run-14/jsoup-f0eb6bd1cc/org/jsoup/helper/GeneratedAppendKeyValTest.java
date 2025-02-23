package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import java.net.URL;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        // Given
        URL inputUrl = new URL("http://example.com/path?key1=value1&key2=value2#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String key = "key3";
        String value = "value3";

        // When
        urlBuilder.appendKeyVal(key, value);

        // Then
        URL result = urlBuilder.build();
        assertEquals("http://example.com/path?key1=value1&key2=value2&key3=value3#anchor", result.toString());
    }

}
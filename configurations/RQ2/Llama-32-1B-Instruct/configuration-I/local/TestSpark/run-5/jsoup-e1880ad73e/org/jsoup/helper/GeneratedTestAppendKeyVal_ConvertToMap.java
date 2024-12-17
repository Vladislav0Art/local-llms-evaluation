package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal_ConvertToMap {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void testAppendKeyVal_ConvertToMap() throws UnsupportedEncodingException {
        // Arrange
        String key = "key";
        String value = "value";
        String separator = "-";
        int num = 0;
        UrlBuilder underTest = new UrlBuilder(new URL("https://example.com/path"));

        // Act
        underTest.appendKeyVal(kv);

        // Assert
        Mockito verify (kv).convertToMap(key, value, separator, num);
    }

}
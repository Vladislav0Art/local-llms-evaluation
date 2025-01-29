package org.jsoup.helper;

import org.jsoup.*;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_InvalidKeys {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void init() {
        urlBuilder = new UrlBuilder("http://example.com");
    }

    @Test
    public void testAppendKeyVal_InvalidKeys() throws Exception {
        String key1 = "key";
        String key2 = "value";

        Mockito.when(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class))).thenReturn(key1 + ": " + key2);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));

        // Check if the exception is thrown
        Exception exception = null;
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("non-existent-key", "value"));
        } catch (Exception e) {
            assert true;
        }

        // Check if the string is correctly formatted
        String result = (String) urlBuilder.build();
        assert not(result.isEmpty());
    }

}
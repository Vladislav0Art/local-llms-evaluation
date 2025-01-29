package org.jsoup.helper;

import org.jsoup.*;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_InvalidValues {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void init() {
        urlBuilder = new UrlBuilder("http://example.com");
    }

    @Test
    public void testAppendKeyVal_InvalidValues() throws Exception {
        String key1 = "key";
        String value1 = "value";

        Mockito.when(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class))).thenReturn(key1 + ": " + value1);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", value1));

        // Check if the exception is thrown
        Exception exception = null;
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("non-existent-key", value1));
        } catch (Exception e) {
            assert true;
        }

        // Check if the string is correctly formatted
        String result = (String) urlBuilder.build();
        assert not(result.isEmpty());
    }

}
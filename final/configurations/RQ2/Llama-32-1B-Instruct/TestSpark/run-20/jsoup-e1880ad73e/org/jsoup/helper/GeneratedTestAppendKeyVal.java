package org.jsoup.helper;

import org.jsoup.*;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void init() {
        urlBuilder = new UrlBuilder("http://example.com");
    }

    @Test
    public void testAppendKeyVal() throws Exception {
        String key = "key";
        String value = "value";

        Mockito.when(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class))).thenReturn(key + ": " + value);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", value));

        // Check if the string is correctly formatted
        String result = (String) urlBuilder.build();
        assert not(result.isEmpty());
    }

}
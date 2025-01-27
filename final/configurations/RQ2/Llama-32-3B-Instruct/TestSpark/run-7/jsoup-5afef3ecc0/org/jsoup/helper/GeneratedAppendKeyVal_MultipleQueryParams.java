package org.jsoup.helper;

import org.jsoup.URL;
import org.junit.Test;

public class GeneratedAppendKeyVal_MultipleQueryParams {

    @Test
    public void appendKeyVal_MultipleQueryParams() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder.appendKeyVal(url, kv);
        // Test the functionality of appendKeyVal with multiple query params.
    }

}
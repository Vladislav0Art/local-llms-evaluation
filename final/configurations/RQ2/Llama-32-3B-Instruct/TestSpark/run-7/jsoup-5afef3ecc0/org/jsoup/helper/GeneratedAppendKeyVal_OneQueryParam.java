package org.jsoup.helper;

import org.jsoup.URL;
import org.junit.Test;

public class GeneratedAppendKeyVal_OneQueryParam {

    @Test
    public void appendKeyVal_OneQueryParam() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String url = "https://example.com/path/to/resource";
        UrlBuilder.appendKeyVal(url, kv);
        // Test the functionality of appendKeyVal with one query param.
    }

}
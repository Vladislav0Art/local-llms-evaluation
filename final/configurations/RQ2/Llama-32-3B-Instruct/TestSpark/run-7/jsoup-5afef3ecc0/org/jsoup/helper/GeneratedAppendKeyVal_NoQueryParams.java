package org.jsoup.helper;

import org.jsoup.URL;
import org.junit.Test;

public class GeneratedAppendKeyVal_NoQueryParams {

    @Test
    public void appendKeyVal_NoQueryParams() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String result = UrlBuilder.appendKeyVal(kv);
        // Test the functionality of appendKeyVal with no query params.
    }

}
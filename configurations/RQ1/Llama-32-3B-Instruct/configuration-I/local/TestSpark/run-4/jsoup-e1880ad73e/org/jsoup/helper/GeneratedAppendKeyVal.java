package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;

public class GeneratedAppendKeyVal {

    @Mock
    Connection.KeyVal kv;

    @Test
    public void appendKeyVal() {
        // Arrange and Act
        urlBuilder.appendKeyVal(kv);

        // Verify the result
        assertNotNull(urlBuilder.q);
    }
}

class UrlBuilder {
    private String u;

    public String buildUrl() {
        return "";
    }

    public void appendToAscii(String input, boolean includeFragment) {
    }

    public void appendKeyVal(Connection.KeyVal kv) {
    }

}
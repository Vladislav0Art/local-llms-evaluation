package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

public class GeneratedAppendKeyVal_appendsKeyValuePairs {

    @Test
    public void appendKeyVal_appendsKeyValuePairs() {
        Connection.KeyVal keyVal = new Connection.KeyVal();
        keyVal.key("key");
        keyVal.value("value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("?key=value", urlBuilder.build().getQuery());
    }

}
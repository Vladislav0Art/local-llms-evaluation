package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedAppendKeyVal {

    @Mock
    private Connection connection;

    public static String encodedKeyVal(KeyVal kv) {
        StringBuilder sb = new StringBuilder(kv.getKey());
        if (!StringUtil.isEmpty(kv.getValue())) {
            sb.append("=").append(URLEncoder.encode(kv.getValue(), org.jsoup.helper.DataUtil.UTF_8));
        }
        return sb.toString();
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        String expected = "key=value";
        KeyVal kv = new KeyVal("key", "value");
        UrlBuilder.appendKeyVal(connection, kv, org.jsoup.helper.DataUtil.UTF_8);
        assertEquals(expected, encodedKeyVal(kv));
    }

}
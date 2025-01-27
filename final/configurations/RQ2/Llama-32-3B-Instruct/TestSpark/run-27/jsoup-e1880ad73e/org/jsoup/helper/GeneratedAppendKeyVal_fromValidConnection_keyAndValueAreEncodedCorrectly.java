package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_fromValidConnection_keyAndValueAreEncodedCorrectly {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyVal_fromValidConnection_keyAndValueAreEncodedCorrectly() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        String expected = "key=value";
        assertEquals(expected, StringUtil.toString(connection.getQuery()));
    }

}
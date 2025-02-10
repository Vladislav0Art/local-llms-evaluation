package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_withInvalidEncoding_thenThrowsUnsupportedEncodingException {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyVal_withInvalidEncoding_thenThrowsUnsupportedEncodingException() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.of(StringUtil.UTF_8, "value with invalid encoding");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().getProtocol().equals("http") && builder.build().getHost().contains("example.com"));
    }

}
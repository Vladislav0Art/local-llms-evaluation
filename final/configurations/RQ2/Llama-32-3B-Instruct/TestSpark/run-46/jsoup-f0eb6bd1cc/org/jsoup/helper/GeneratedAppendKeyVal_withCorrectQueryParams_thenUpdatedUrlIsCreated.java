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
public class GeneratedAppendKeyVal_withCorrectQueryParams_thenUpdatedUrlIsCreated {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyVal_withCorrectQueryParams_thenUpdatedUrlIsCreated() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.of("param1", "value1");
        when(connection.query().put(kv)).thenReturn(kv);
        builder.appendKeyVal(kv);
        assertEquals("http://example.com?param1=value1", builder.build().toString());
    }

}
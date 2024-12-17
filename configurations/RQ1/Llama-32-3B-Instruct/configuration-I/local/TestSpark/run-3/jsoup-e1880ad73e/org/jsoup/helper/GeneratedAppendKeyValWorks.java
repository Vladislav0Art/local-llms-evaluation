package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWorks {

    public Connection connection = Mockito.mock(Connection.class);

    private UrlBuilder urlBuilder = new UrlBuilder(connection);

    @Test
    public void appendKeyValWorks() throws UnsupportedEncodingException {
        // given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.q = Mockito.mock(StringBuilder.class);

        // when
        urlBuilder.appendKeyVal(kv);

        // then
        assertEquals("?key=value", urlBuilder.q.toString());
    }

}
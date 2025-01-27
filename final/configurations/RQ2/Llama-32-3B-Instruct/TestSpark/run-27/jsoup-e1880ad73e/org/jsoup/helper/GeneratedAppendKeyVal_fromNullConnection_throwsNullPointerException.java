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
public class GeneratedAppendKeyVal_fromNullConnection_throwsNullPointerException {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyVal_fromNullConnection_throwsNullPointerException() {
        UrlBuilder builder = new UrlBuilder(null);
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new Connection.KeyVal("key", "value")));
    }

}
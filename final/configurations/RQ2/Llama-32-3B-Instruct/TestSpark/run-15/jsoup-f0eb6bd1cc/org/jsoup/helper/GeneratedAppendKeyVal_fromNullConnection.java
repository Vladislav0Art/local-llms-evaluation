package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal_fromNullConnection {

    @Test
    public void appendKeyVal_fromNullConnection() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyVal = null;
        try {
            urlBuilder.appendKeyVal(keyVal);
            assert false;
        } catch (NullPointerException e) {
            Mockito.verifyNoThrowingExceptions(urlBuilder, () -> urlBuilder.appendKeyVal(keyVal));
        }
    }

}
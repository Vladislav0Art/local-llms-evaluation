package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal_toEmptyUrl {

    @Test
    public void appendKeyVal_toEmptyUrl() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL(""));
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "val");
        urlBuilder.appendKeyVal(keyVal);
        Mockito.verify(urlBuilder).build();
    }

}
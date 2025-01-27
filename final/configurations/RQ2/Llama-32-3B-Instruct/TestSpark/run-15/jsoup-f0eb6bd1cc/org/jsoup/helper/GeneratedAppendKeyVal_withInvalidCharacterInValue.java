package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal_withInvalidCharacterInValue {

    @Test
    public void appendKeyVal_withInvalidCharacterInValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "invalid character!");
        try {
            urlBuilder.appendKeyVal(keyVal);
            assert false;
        } catch (UnsupportedEncodingException e) {
            Mockito.verifyNoThrowingExceptions(urlBuilder, () -> urlBuilder.appendKeyVal(keyVal));
        }
    }

}
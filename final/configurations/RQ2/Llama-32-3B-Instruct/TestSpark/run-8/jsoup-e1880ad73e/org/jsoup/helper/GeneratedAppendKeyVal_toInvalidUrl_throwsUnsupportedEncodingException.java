package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyVal_toInvalidUrl_throwsUnsupportedEncodingException {

    @Test
    public void appendKeyVal_toInvalidUrl_throwsUnsupportedEncodingException() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL(null));
        java.lang.UnsupportedEncodingException e = assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(kv));
    }

}
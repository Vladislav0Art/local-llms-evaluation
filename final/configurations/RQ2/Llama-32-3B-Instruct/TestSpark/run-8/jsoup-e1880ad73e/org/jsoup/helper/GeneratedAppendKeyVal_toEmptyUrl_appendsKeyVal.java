package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyVal_toEmptyUrl_appendsKeyVal {

    @Test
    public void appendKeyVal_toEmptyUrl_appendsKeyVal() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        String createdUrl = StringUtil.toString(builder.build());
        assertThat(createdUrl, is("http://example.com?key=value"));
    }

}
package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_withNullKeyValueValueAndEmptyKeyThrowsUnsupportedEncoding {

    private MockUrl urlMock() {
        return mock(URL.class);
    }

    @Test
    public void appendKeyVal_withNullKeyValueValueAndEmptyKeyThrowsUnsupportedEncoding() {
        URL inputUrl = urlMock();
        when(kv).thenReturn(new KeyVal("", null));

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

}
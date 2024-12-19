package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Base64;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_withInvalidKeyValue_throwsUnsupportedEncodingException {

    @Mock
    private URL inputUrl;

    @Mock
    private URI baseUri;

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyVal_withInvalidKeyValue_throwsUnsupportedEncodingException() {
        when(baseUri.getQuery()).thenReturn("");
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}
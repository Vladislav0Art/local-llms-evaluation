package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runnerMocks;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import javax.annotation.Nullable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyVal_NullUrl_ThrowsNullPointerException {

    @Mock
    private URL url;

    @Mock
    private String encodedKey;

    @Mock
    private String encodedValue;

    @Test
    public void appendKeyVal_NullUrl_ThrowsNullPointerException() {
        UrlBuilder builder = new UrlBuilder(null);
        assertThrows(NullPointerException.class, () -> builder.appendKeyVal(kv));
    }

}
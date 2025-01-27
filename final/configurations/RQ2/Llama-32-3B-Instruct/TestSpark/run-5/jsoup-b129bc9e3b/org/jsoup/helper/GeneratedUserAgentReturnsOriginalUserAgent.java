package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUserAgentReturnsOriginalUserAgent {

    @Test
    public void userAgentReturnsOriginalUserAgent() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.37";
        Connection connection = new HttpConnection().userAgent(userAgent);
        assertEquals(userAgent, ((HttpConnection) connection).getUserAgent());
    }

}
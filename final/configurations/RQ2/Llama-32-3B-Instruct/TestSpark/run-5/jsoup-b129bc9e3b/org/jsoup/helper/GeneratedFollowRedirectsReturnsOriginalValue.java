package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFollowRedirectsReturnsOriginalValue {

    @Test
    public void followRedirectsReturnsOriginalValue() {
        boolean original = true;
        Connection connection = new HttpConnection().followRedirects(original);
        assertEquals(original, ((HttpConnection) connection).followRedirects());
    }

}
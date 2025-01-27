package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedMethodReturnsOriginalMethod {

    @Test
    public void methodReturnsOriginalMethod() {
        Method original = HEAD;
        Connection connection = new HttpConnection().method(original);
        assertEquals(original, ((HttpConnection) connection).getMethod());
    }

}
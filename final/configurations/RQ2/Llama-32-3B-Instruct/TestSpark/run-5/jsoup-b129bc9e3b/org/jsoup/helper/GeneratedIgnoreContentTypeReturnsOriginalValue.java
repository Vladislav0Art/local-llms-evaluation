package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIgnoreContentTypeReturnsOriginalValue {

    @Test
    public void ignoreContentTypeReturnsOriginalValue() {
        boolean original = true;
        Connection connection = new HttpConnection().ignoreContentType(original);
        assertEquals(original, ((HttpConnection) connection).ignoreContentType());
    }

}
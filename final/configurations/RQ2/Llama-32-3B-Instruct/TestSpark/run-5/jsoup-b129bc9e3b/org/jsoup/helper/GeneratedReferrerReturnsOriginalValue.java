package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedReferrerReturnsOriginalValue {

    @Test
    public void referrerReturnsOriginalValue() {
        String original = "https://www.example.com";
        Connection connection = new HttpConnection().referrer(original);
        assertEquals(original, ((HttpConnection) connection).referrer());
    }

}
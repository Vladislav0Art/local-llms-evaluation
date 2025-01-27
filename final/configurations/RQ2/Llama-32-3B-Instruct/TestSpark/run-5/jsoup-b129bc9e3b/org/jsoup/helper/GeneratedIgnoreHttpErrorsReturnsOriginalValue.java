package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIgnoreHttpErrorsReturnsOriginalValue {

    @Test
    public void ignoreHttpErrorsReturnsOriginalValue() {
        boolean original = true;
        Connection connection = new HttpConnection().ignoreHttpErrors(original);
        assertEquals(original, ((HttpConnection) connection).ignoreHttpErrors());
    }

}
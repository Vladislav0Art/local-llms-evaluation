package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class GeneratedTimeoutSetsTimeout {

    @Test
    public void timeoutSetsTimeout() {
        int millis = 1000;
        Connection connection = HttpConnection.timeout(millis);
        Assert.assertEquals(millis, connection.timeout());
    }

}
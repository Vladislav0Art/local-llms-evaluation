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

public class GeneratedExecuteReturnsResponse {

    @Test
    public void executeReturnsResponse() throws IOException {
        Connection response = Mockito.mock(Connection.Response.class);
        Connection connection = HttpConnection.execute(response);
        Assert.assertEquals(response, connection.response());
    }

}
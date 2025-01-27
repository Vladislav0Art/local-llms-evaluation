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

public class GeneratedNewRequestCreatesNewRequest {

    @Test
    public void newRequestCreatesNewRequest() {
        Connection request = Mockito.mock(Connection.class);
        Connection newRequest = HttpConnection.newRequest();
        Assert.assertEquals(request, newRequest);
    }

}
package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class GeneratedConnect_MalformedUrl_ThrowsMalformedURLException {

    @Test
    public void connect_MalformedUrl_ThrowsMalformedURLException() {
        URL url = new URL("invalid://example.com");
        HttpConnection.connect(url);
    }

}
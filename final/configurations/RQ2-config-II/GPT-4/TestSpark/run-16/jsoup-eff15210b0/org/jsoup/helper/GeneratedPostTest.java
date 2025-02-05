package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedPostTest {

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = new HttpConnection().url("https://www.google.com");
        Document document = connection.post();
        Assert.assertNotNull(document);
    }

}
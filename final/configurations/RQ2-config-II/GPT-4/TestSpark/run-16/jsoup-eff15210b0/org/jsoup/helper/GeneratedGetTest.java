package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedGetTest {

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = new HttpConnection().url("https://www.google.com");
        Document document = connection.get();
        Assert.assertNotNull(document);
    }

}
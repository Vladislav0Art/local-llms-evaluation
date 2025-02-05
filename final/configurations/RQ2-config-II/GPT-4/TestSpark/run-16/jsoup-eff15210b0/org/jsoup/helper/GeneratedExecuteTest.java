package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = new HttpConnection().url("https://www.google.com");
        Connection.Response response = connection.execute();
        Assert.assertNotNull(response);
    }

}
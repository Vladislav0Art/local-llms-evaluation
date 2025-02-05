package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedReferrerTest {

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        connection.referrer("https://www.refererwebsite.com");
        Assert.assertNotNull(connection);
    }

}
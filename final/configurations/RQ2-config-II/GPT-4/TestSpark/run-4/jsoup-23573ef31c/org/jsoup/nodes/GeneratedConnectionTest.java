package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document document = new Document("https://www.example.com");
        Connection connection = Mockito.mock(Connection.class);
        document.connection(connection);
        Assert.assertEquals(connection, document.connection());
    }

}
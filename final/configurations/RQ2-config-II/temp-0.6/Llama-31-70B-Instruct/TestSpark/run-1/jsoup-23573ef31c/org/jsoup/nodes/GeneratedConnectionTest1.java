package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class GeneratedConnectionTest1 {

    @Test
    public void connectionTest1() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = Document.createShell("http://www.example.com");
        document.connection(connection);
        Assert.assertEquals(connection, document.connection());
    }

}
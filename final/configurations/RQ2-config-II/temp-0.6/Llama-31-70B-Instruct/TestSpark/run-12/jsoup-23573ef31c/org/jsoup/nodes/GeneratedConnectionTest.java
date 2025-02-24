package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.connection()).thenReturn(Mockito.mock(Connection.class));
        Connection connection = document.connection();
        Assert.assertNotNull(connection);
    }

}
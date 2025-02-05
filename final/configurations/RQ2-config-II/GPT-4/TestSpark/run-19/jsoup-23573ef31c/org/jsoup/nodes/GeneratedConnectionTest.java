package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Connection mockConnection = mock(Connection.class);
        Document doc = new Document("https://google.com");
        doc.connection(mockConnection);
        Assert.assertEquals(mockConnection, doc.connection());
    }

}
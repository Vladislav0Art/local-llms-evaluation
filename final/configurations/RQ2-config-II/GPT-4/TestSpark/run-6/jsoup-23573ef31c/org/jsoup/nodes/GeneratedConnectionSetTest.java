package org.jsoup.nodes;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedConnectionSetTest {

    @Test
    public void connectionSetTest() {
        Document document = new Document("http://localhost");
        Connection connection = Mockito.mock(Connection.class);
        document.connection(connection);
        Assert.assertNotNull(document.connection());
    }

}
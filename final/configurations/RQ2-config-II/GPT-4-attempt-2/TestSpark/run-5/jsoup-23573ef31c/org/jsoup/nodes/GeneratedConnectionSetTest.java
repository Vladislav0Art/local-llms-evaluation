package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedConnectionSetTest {

    @Test
    public void connectionSetTest() {
        Document doc = new Document("http://example.com");
        Connection connection = mock(Connection.class);
        doc.connection(connection);
        Assert.assertEquals(connection, doc.connection());
    }

}
package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Connection connection = Connection.connect("http://example.com");
        Document doc = new Document("http://example.com").connection(connection);
        assertEquals(connection, doc.connection());
    }

}
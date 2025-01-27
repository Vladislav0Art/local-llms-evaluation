package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConnection WithConnectionTest {

    @Test
    public void connection

    WithConnectionTest() {
        Document document = new Document("http://example.com");
        Connection connection = Mockito.mock(Connection.class);
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}
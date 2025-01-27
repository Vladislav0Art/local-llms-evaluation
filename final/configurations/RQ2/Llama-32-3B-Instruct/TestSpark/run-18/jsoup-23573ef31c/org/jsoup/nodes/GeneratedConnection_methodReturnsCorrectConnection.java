package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnection_methodReturnsCorrectConnection {

    @BeforeClass
    public static void setup() {
        Document.document = null;
    }

    private static Document document = new Document("");

    @Test
    public void connection_methodReturnsCorrectConnection() {
        Connection conn = new Connection();
        when(Document.connection()).thenReturn(conn);
        assertEquals(conn, document.connection());
    }

}
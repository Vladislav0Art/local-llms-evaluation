package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedConnectionMethodTest {

    @Test
    public void connectionMethodTest() {
        Connection connection = new Connection();
        Document document = Document.createShell(connection.toString());
        assertNotNull(document.connection());
    }

}
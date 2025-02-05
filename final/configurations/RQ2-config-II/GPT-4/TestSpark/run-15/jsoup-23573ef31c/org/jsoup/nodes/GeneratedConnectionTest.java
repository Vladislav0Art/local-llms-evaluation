package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document document = new Document("http://localhost");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

}
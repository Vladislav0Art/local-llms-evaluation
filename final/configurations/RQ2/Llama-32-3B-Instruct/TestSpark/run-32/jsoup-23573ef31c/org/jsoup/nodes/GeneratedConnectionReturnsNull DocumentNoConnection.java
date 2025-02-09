package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedConnectionReturnsNull DocumentNoConnection {

    @Test
    public void connectionReturnsNull

    DocumentNoConnection() {
        Document document = new Document("https://example.com");
        Connection connection = null;
        assertEquals(connection, document.connection());
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedConnectionDocument_test {

    @Test
    public void connectionDocument_test() {
        Connection connection = new Connection();
        Document document = Document.createShell("http://example.com").connection(connection);
        assertNotNull(document.connection());
        assertTrue(document.connection() == connection);
    }

}
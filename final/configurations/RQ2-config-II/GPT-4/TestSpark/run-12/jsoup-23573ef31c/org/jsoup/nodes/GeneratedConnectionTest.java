package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document document = new Document("http://localhost");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

}
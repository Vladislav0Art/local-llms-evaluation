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

public class GeneratedConnectionSettingTest {

    @Test
    public void connectionSettingTest() {
        Document document = new Document("http://localhost");
        Connection connection = mock(Connection.class);
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}
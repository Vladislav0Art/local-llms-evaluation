package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConnectionNullTest {

    @Test
    public void connectionNullTest() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection();
        assertNull(connection);
    }

}
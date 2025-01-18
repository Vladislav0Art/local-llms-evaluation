package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        Document document = new Document("https://www.google.com");
        Connection connection = document.connection();
        Assert.assertNotNull(connection);
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnectionEquals_ConnectionReturnsSameConnection {

    @Mock
    private Connection connection;

    @Test
    public void connectionEquals_ConnectionReturnsSameConnection() {
        Connection connection1 = new Connection();
        Connection connection2 = new Connection();
        connection2.setUri("https://www.example.com");
        Document document = new Document("https://www.example.com").connection(connection1);
        org.junit.Assert.assertEquals(document.connection(), connection2);
    }

}
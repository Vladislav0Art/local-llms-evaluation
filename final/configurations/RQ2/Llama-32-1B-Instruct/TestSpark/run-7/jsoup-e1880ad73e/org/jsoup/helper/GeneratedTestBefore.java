package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Javascript;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestBefore {

    private Document doc;

    @Before
    public void setup() {
        Connection connection = ConnectionBuilder.newConnection();
        connection.connect("https://example.com");
        doc = connection.build().document();
    }

    @Test
    public void testBefore() {
        System.out.println("Before called.");
    }

}
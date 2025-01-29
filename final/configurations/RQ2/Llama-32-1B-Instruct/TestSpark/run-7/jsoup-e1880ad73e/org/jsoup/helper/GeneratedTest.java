package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Javascript;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private Document doc;

    @Before
    public void setup() {
        Connection connection = ConnectionBuilder.newConnection();
        connection.connect("https://example.com");
        doc = connection.build().document();
    }

}
package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Javascript;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestBuild {

    private Document doc;

    @Before
    public void setup() {
        Connection connection = ConnectionBuilder.newConnection();
        connection.connect("https://example.com");
        doc = connection.build().document();
    }

    @Test
    public void testBuild() throws Exception {
        String expectedUrl = "https://example.com";
        URLBuilder urlBuilder = new URLBuilder(doc);
        System.out.println(urlBuilder.toString());
    }

}
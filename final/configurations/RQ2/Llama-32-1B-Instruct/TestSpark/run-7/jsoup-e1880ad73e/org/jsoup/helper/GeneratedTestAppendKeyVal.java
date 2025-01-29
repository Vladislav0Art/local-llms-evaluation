package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Javascript;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestAppendKeyVal {

    private Document doc;

    @Before
    public void setup() {
        Connection connection = ConnectionBuilder.newConnection();
        connection.connect("https://example.com");
        doc = connection.build().document();
    }

    @Test
    public void testAppendKeyVal() throws Exception {
        Connection connection = ConnectionBuilder.newConnection();
        connection.connect("https://example.com");
        Document doc = connection.build().document();
        Element inputElement = doc.selectFirst("input[name='key1'][value='value1']");
        KeyVal keyVal = new KeyVal(inputElement, "value2");
        URLBuilder urlBuilder = new URLBuilder(doc);
        urlBuilder.appendKeyVal(keyVal);
    }

}
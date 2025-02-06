package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedConnectionMethodReturnsCorrectConnection {

    @Test
    public void connectionMethodReturnsCorrectConnection() {
        String baseUri = "https://www.example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = new Document(connection);
        assertNotNull(document.connection());
    }

}
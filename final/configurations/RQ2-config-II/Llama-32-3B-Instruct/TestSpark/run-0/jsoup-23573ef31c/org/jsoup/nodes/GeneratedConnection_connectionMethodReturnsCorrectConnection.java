package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedConnection_connectionMethodReturnsCorrectConnection {

    @Test
    public void connection_connectionMethodReturnsCorrectConnection() {
        Connection expectedConnection = Jsoup.connect("https://www.example.com").get();
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedConnection, document.connection());
    }

}
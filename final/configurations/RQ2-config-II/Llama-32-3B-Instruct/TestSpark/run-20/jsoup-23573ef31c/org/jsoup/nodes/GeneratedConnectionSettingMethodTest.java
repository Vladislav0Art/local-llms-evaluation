package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedConnectionSettingMethodTest {

    @Test
    public void connectionSettingMethodTest() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection(new Connection());
        assertEquals(new Connection(), connection);
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateConnection {

    @Test
    public void createConnection() {
        Document document = new Document("https://www.example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

}
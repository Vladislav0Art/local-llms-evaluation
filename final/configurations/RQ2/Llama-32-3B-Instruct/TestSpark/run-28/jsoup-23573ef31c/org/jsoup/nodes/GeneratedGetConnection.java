package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetConnection {

    @Test
    public void getConnection() {
        Document document = new Document("https://www.example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

}
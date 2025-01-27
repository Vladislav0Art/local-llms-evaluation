package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.Jsoup.connect;

public class GeneratedLocation ReturnsDefaultLocation {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void location

    ReturnsDefaultLocation() {
        Document document = new Document();
        String location = document.location();
        assertTrue(location.startsWith("https://www.example.com"));
    }

}
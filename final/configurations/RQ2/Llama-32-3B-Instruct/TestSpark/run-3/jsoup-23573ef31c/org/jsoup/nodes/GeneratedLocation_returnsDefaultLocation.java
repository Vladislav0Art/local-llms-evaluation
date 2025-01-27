package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedLocation_returnsDefaultLocation {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void location_returnsDefaultLocation() {
        Document document = new Document();
        String location = document.location();
        assertTrue(location.startsWith("https://www.example.com"));
    }

}
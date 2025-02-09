package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLocation_NonEmptyStringReturnsLocation {

    @Mock
    private Connection connection;

    public Document document = new Document("https://www.example.com");

    @Test
    public void location_NonEmptyStringReturnsLocation() {
        String location = document.location();
        org.junit.Assert.assertNotEquals("", location);
    }

}
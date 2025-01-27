package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedLocation_ReturnsString {

    @Mock
    private Connection connection;

    @Test
    public void location_ReturnsString() {
        String location = "http://example.com";
        when(connection.location()).thenReturn(location);
        Document document = new Document("baseUri", connection);
        assertThat(document.location(), is(location));
    }

}
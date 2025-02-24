package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestLocation {

    private Document document;

    @Test
    public void testLocation() {
        document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}
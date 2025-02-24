package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTitle {

    private Document document;

    @Test
    public void testTitle() {
        document = new Document("http://example.com");
        document.title("Example Title");
        assertEquals("Example Title", document.title());
    }

}
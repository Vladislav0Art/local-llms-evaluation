package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestQuirksMode {

    private Document document;

    @Test
    public void testQuirksMode() {
        document = new Document("http://example.com");
        document.quirksMode(QuirksMode.noQuirks);
        assertEquals(QuirksMode.noQuirks, document.quirksMode());
    }

}
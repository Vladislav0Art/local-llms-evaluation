package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedQuirksMode_QuirksModeIsReturned {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private OutputSettings outputSettings;

    @Test
    public void quirksMode_QuirksModeIsReturned() {
        QuirksMode quirksMode = new QuirksMode();
        Document document = new Document("http://example.com");
        QuirksMode result = document.quirksMode();
        assertNotNull(result);
        assertEquals(quirksMode, result);
    }

}
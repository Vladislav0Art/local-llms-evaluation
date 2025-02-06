package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText StringIsCorrectlyPlacedInTextElement {

    @Mock
    private Connection connection;

    @Test
    public void text

    StringIsCorrectlyPlacedInTextElement() {
        when(connection.text()).thenReturn("test");
        Document document = Document.createShell("http://example.com");
        assertEquals("test", document.text().trim());
    }

}
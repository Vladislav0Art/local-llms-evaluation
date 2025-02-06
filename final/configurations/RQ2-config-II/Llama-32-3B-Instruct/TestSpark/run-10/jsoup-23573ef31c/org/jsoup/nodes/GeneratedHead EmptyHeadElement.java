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
public class GeneratedHead EmptyHeadElement {

    @Mock
    private Connection connection;

    @Test
    public void head

    EmptyHeadElement() {
        Document document = Document.createShell("http://example.com");
        assertNull(document.head());
    }

}
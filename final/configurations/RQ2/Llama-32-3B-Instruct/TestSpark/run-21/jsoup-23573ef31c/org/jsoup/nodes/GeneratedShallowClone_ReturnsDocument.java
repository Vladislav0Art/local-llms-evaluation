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
public class GeneratedShallowClone_ReturnsDocument {

    @Mock
    private Connection connection;

    @Test
    public void shallowClone_ReturnsDocument() {
        Document document = mock(Document.class);
        when(document.shallowClone()).thenReturn(document);
        Document shallowClonedDocument = Document.createShell("baseUri");
        assertEquals(document, shallowClonedDocument);
    }

}
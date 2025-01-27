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
public class GeneratedClone_ReturnsDocument {

    @Mock
    private Connection connection;

    @Test
    public void clone_ReturnsDocument() {
        Document document = mock(Document.class);
        when(document.clone()).thenReturn(document);
        Document clonedDocument = Document.createShell("baseUri");
        assertEquals(document, clonedDocument);
    }

}
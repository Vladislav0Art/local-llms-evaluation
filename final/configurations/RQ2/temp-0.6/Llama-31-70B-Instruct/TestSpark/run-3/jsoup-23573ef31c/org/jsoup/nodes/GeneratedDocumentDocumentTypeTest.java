package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.DocumentType;
import org.jsoup.select.Elements;
import org.jsoup.select.FormElement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDocumentDocumentTypeTest {

    @Mock
    private Document document;

    @Mock
    private DocumentType docType;

    @Mock
    private Elements elements;

    @Mock
    private FormElement formElement;

    @Mock
    private Element element;

    @Test
    public void documentDocumentTypeTest() {
        docType = Mockito.mock(DocumentType.class);
        document = Mockito.mock(Document.class);
        Mockito.when(document.documentType()).thenReturn(docType);
        assertEquals(docType, document.documentType());
    }

}
package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertDocumentFromJsoup {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @InjectMocks
    private W3CDom w3cdom;

    @Test
    public void convertDocumentFromJsoup() {
        Document in = mock(Document.class);
        Document out = w3cdom.convert(in, new org.jsoup.nodes.Document());
        assertNotNull(out);
    }

}
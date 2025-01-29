package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedConvert_sets_correct_document {

    private static Document doc;
    private static W3CDom w3cdom;

    @BeforeClass
    public static void init() {
        Properties properties = new Properties();
        // Set up mock properties here
        when(propertiesFromFile()).thenReturn(properties);
        doc = convert(doc, properties);
        w3cdom = new W3CDom();
    }

    @Test
    public void convert_sets_correct_document() {
        org.jsoup.nodes.Document docMock = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Document.class));
        Document result = new W3CDom();
        w3cdom = new W3CDom();
        w3cdom.convert(doc, docMock);
    }

}
package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedConvert_selectXpath_returnsNodeListCorrectType {

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
    public void convert_selectXpath_returnsNodeListCorrectType() {
        org.jsoup.nodes.Document doc = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Element.class));
        W3CDOM w3cdom = new W3CDom();
        NodeList expectedNodes = new ArrayList<>();
        when(w3cdom.selectXpath("xpath", doc)).thenReturn(expectedNodes);
        w3cdom = new W3CDom();
        List<Node> result = w3cdom.convert(doc, null);
        assertEquals(expectedNodes, result);
    }

}
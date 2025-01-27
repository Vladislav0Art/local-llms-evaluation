package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromJsoupFromElementReturnsDocument {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Mock
    private DocumentBuilderFactory documentFactory;

    @Test
    public void fromJsoupFromElementReturnsDocument() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = org.jsoup.helper.W3CDom.fromJsoup(in);
        assertNotNull(out);
    }

}
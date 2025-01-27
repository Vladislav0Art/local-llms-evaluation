package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedConvert_ConvertsElementToJsoupElement {

    @Mock
    private DocumentBuilder builder;

    @Mock
    private DocumentBuilderFactory factory;

    @InjectMocks
    private W3CDom w3cDom;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(factory.newDocumentBuilder()).thenReturn(builder);
    }

    @Test
    public void convert_ConvertsElementToJsoupElement() {
        Element element = new Element();
        org.jsoup.nodes.Element result = w3cDom.convert(element);
        // assert the output is a jsoup element
    }
}

}
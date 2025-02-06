package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAwareReturnsTrue {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void namespaceAwareReturnsTrue() {
        boolean expected = true;
        Mockito.when(documentBuilderFactory.newDocumentBuilder()).thenReturn(new DocumentBuilder());
        W3CDom w3cDom = new W3CDom();
        boolean result = w3cDom.namespaceAware();
        assert result == expected;
    }

}
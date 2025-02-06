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
public class GeneratedContextNodeReturnsDocument {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void contextNodeReturnsDocument() {
        Document wDoc = new Document();
        Document expected = wDoc;
        W3CDom.Document actual = W3CDom.contextNode(wDoc);
        assert actual == expected;
    }

}
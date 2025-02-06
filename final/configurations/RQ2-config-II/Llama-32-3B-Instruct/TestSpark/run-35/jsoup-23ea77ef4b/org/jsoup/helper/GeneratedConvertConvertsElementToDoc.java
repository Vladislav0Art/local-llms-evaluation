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
public class GeneratedConvertConvertsElementToDoc {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void convertConvertsElementToDoc() {
        org.jsoup.nodes.Element jsoupElement = new org.jsoup.nodes.Element();
        Document expected = new Document();
        Document actual = W3CDom.fromJsoup(jsoupElement);
        assert actual == expected;
    }

}
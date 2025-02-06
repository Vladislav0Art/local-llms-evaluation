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
public class GeneratedConvertConvertsJsoupToDoc {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void convertConvertsJsoupToDoc() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document();
        Document expected = new Document();
        Document actual = W3CDom.convert(jsoupDoc);
        assert actual == expected;
    }

}
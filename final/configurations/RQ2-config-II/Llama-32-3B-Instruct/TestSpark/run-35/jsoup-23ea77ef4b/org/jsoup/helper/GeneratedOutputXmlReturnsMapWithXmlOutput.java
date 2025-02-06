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
public class GeneratedOutputXmlReturnsMapWithXmlOutput {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void OutputXmlReturnsMapWithXmlOutput() {
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("method", "xml");
        W3CDom.HashMap<String, String> actual = W3CDom.OutputXml();
        assert actual.get(0) == expectedMap.get(0);
    }

}
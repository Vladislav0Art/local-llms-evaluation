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
public class GeneratedAsStringReturnsXmlDocAsStringWithProperties {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void asStringReturnsXmlDocAsStringWithProperties() {
        Document doc = new Document();
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "xml");
        StringWriter output = new StringWriter();
        String result = W3CDom.asString(doc, properties);
        assert result.startsWith("<");
    }

}
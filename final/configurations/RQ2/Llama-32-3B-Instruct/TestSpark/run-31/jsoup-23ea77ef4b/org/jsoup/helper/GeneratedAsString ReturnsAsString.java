package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsString ReturnsAsString {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    @Test
    public void asString

    ReturnsAsString() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream("xml".getBytes()));
        String expected = "xml";
        String actual = W3CDom.asString(document);
        org.junit.Assert.assertEquals(expected, actual);
    }

}
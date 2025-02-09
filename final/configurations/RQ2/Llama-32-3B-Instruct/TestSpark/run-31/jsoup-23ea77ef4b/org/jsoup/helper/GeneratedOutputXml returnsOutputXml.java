package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOutputXml returnsOutputXml {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    @Test
    public void OutputXml

    returnsOutputXml() {
        String expected = "output xml";
        String actual = W3CDom.OutputXml().get("outputXml");
        org.junit.Assert.assertEquals(expected, actual);
    }

}
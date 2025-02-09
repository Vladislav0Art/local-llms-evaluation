package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOutputHtml returnsOutputHtml {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    @Test
    public void OutputHtml

    returnsOutputHtml() {
        String expected = "output html";
        String actual = W3CDom.OutputHtml().get("outputHtml");
        org.junit.Assert.assertEquals(expected, actual);
    }

}
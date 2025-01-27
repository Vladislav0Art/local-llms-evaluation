package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsStringFromJsoupReturnsString {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Mock
    private DocumentBuilderFactory documentFactory;

    @Test
    public void asStringFromJsoupReturnsString() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        String result = org.jsoup.helper.W3CDom.asString(in, null);
        assertNotNull(result);
    }

}
package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsString_W3CDocAsXml {

    @Mock
    private Document doc;

    @Mock
    private Node node;

    @Before
    public void setup() {
        // Setup is not needed as per the requirements.
    }

    @Test
    public void asString_W3CDocAsXml() {
        String result = W3CDom.asString(doc, null);
        assertTrue(result.contains("<"));
    }

}
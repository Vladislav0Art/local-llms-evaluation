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
public class GeneratedOutputHtml_AsXmlDocument {

    @Mock
    private Document doc;

    @Mock
    private Node node;

    @Before
    public void setup() {
        // Setup is not needed as per the requirements.
    }

    @Test
    public void OutputHtml_AsXmlDocument() {
        Document wDoc = W3CDom.OutputHtml();
        assertNotNull(wDoc);
    }

}
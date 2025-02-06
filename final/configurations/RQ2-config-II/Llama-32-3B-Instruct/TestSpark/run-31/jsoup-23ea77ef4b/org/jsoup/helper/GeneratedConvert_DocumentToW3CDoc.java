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
public class GeneratedConvert_DocumentToW3CDoc {

    @Mock
    private Document doc;

    @Mock
    private Node node;

    @Before
    public void setup() {
        // Setup is not needed as per the requirements.
    }

    @Test
    public void convert_DocumentToW3CDoc() {
        Document out = new Document();
        W3CDom.convert(doc, out);
        assertNotNull(out);
    }

}
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
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSourceNodesNodeListTest {

    @Mock
    private Document document;

    @Mock
    private Element element;

    public static final String XML = "<html><body>Hello World!</body></html>";

    public static final String HTML = "<html><body>Hello World!</body></html>";

    @Test
    public void sourceNodesNodeListTest() {
        List<Node> result = W3CDom.sourceNodes(new ArrayList<>(), Node.class);
        org.junit.Assert.assertSame(result, new ArrayList<>());
    }

}
package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFragment_ValidInputAndUri_ReturnsList {

    @Mock
    private TreeBuilder treeBuilder;

    public void setup() {
        when(treeBuilder.newInstance()).thenReturn(this);
        // Add other setup necessary for tests
    }

    @Test
    public void parseFragment_ValidInputAndUri_ReturnsList() {
        String inputFragment = "<html><body>Hello World</body></html>";
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        List<Node> result = new ArrayList<>();
        when(treeBuilder.parseFragment(inputFragment, baseUri, parser)).thenReturn(result);
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) treeBuilder.newInstance();
        List<Node> actualResult = xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser);
        assertEquals(result, actualResult);
    }

}
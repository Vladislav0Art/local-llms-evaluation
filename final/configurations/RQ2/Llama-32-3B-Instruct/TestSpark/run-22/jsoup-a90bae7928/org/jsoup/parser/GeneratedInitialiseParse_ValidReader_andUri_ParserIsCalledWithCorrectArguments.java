package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitialiseParse_ValidReader_andUri_ParserIsCalledWithCorrectArguments {

    @Mock
    private TreeBuilder treeBuilder;

    public void setup() {
        when(treeBuilder.newInstance()).thenReturn(this);
        // Add other setup necessary for tests
    }

    @Test
    public void initialiseParse_ValidReader_andUri_ParserIsCalledWithCorrectArguments() {
        Reader reader = new StringReader("<html></html>");
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        when(treeBuilder.initialiseParse(reader, baseUri, parser)).thenReturn(this);
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) treeBuilder.newInstance();
        xmlTreeBuilder.initialiseParse(reader, baseUri, parser);
    }

}
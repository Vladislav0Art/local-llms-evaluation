package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFragmentStringInputBaseUriParser {

    @Mock
    private Reader reader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    public XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void parseFragmentStringInputBaseUriParser() {
        when(xmlTreeBuilder.parseFragment(any(String.class), any(String.class), any(Parser.class))).thenReturn(null);
    }

}
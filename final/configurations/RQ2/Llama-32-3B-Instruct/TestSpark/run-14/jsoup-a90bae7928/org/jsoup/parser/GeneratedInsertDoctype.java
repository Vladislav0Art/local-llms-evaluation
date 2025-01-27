package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertDoctype {

    @Mock
    private Reader reader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    public XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void insertDoctype() {
        Token.Doctype d = mock(Token.Doctype.class);
        xmlTreeBuilder.insert(d);
    }

}
package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTokenInvalidTest {

    @Test
    public void processTokenInvalidTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        xmlTreeBuilder.process(token);
    }

}
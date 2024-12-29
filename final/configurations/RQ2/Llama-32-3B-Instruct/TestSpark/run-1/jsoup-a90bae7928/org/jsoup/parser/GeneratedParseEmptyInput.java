package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.Reader;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseEmptyInput {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testSubject() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void parseEmptyInput() {
        when(treeBuilderMock.initialiseParse(any(Reader.class), anyString(), any(Parser.class))).thenReturn(false);
        XmlTreeBuilder xmlTreeBuilder = testSubject();
        Document document = xmlTreeBuilder.parse(new StringReader(""), "http://example.com");
        assertNull(document);
    }

}
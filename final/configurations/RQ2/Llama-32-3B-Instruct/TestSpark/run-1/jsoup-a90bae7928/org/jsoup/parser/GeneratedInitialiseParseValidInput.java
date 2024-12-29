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
public class GeneratedInitialiseParseValidInput {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testSubject() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void initialiseParseValidInput() {
        when(treeBuilderMock.initialiseParse(any(Reader.class), anyString(), any(Parser.class))).thenReturn(true);
        XmlTreeBuilder xmlTreeBuilder = testSubject();
        boolean result = xmlTreeBuilder.initialiseParse(new StringReader("<html>"), "http://example.com");
        assertTrue(result);
    }

}
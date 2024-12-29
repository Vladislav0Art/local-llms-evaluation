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
public class GeneratedInitialiseParseInvalidInput {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testSubject() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void initialiseParseInvalidInput() {
        when(treeBuilderMock.initialiseParse(any(Reader.class), anyString(), any(Parser.class))).thenReturn(false);
        XmlTreeBuilder xmlTreeBuilder = testSubject();
        boolean result = xmlTreeBuilder.initialiseParse(new StringReader("<invalid>"), "http://example.com");
        assertFalse(result);
    }

}
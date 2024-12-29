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
public class GeneratedParseFragmentInvalidInput {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testSubject() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void parseFragmentInvalidInput() {
        when(treeBuilderMock.initialiseParse(any(Reader.class), anyString(), any(Parser.class))).thenReturn(false);
        XmlTreeBuilder xmlTreeBuilder = testSubject();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<html>", "http://example.com", mock(Parser.class));
        assertNull(nodes);
    }

}
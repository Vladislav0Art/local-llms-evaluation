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
public class GeneratedParseValidInput {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testSubject() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void parseValidInput() {
        when(treeBuilderMock.parse(any(Reader.class), anyString())).thenReturn(mock(Document.class));
        XmlTreeBuilder xmlTreeBuilder = testSubject();
        Document document = xmlTreeBuilder.parse(new StringReader("<html>"), "http://example.com");
        assertNotNull(document);
        assertTrue(document instanceof Document);
    }

}
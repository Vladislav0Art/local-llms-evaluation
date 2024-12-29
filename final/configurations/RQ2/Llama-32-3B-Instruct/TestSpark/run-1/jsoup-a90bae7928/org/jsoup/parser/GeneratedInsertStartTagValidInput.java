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
public class GeneratedInsertStartTagValidInput {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testSubject() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void insertStartTagValidInput() {
        when(treeBuilderMock.insert(any(Token.StartTag.class))).thenReturn(mock(Element.class));
        XmlTreeBuilder xmlTreeBuilder = testSubject();
        Element element = xmlTreeBuilder.insert(new Token.StartTag());
        assertNotNull(element);
        assertTrue(element instanceof Element);
    }

}
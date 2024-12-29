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
public class GeneratedInsertCommentValidInput {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testSubject() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void insertCommentValidInput() {
        when(treeBuilderMock.insert(any(Token.Comment.class))).thenReturn(mock(Node.class));
        XmlTreeBuilder xmlTreeBuilder = testSubject();
        Node node = xmlTreeBuilder.insert(new Token.Comment());
        assertNotNull(node);
        assertTrue(node instanceof Node);
    }

}
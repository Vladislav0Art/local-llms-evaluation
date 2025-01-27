package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProcessCharacterBasicTest {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testInstance() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void processCharacterBasicTest() {
        Token token = new Token(Token.Character, 'a');
        boolean result = testInstance().process(token);
        assertFalse(result);
    }

}
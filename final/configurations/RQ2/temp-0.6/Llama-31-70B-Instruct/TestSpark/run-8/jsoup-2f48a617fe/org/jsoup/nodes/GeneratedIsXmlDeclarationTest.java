package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclarationTest {

    @Mock
    private Document.OutputSettings outputSettings;
    @Mock
    private Parser parser;

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Hello, World!");
        assertEquals(false, comment.isXmlDeclaration());
    }

}
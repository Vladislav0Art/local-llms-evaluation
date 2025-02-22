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
public class GeneratedTest {

    @Mock
    private Document.OutputSettings outputSettings;
    @Mock
    private Parser parser;

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Hello, World!");
        assertEquals("Hello, World!", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Hello, World!");
        comment.setData("Goodbye, World!");
        assertEquals("Goodbye, World!", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Hello, World!");

        when(outputSettings.prettyPrint()).thenReturn(true);
        when(outputSettings.outline()).thenReturn(true);

        assertEquals("<!--Hello, World!-->", comment.outerHtml());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Hello, World!");
        assertEquals(false, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Hello, World!");
        assertEquals(null, comment.asXmlDeclaration());
    }

}
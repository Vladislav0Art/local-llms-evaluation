package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() throws IOException, InterruptedException {
        JsdslComment comment = new JsdslComment("#comment");
        String result = comment.asXmlDeclaration();
        assertTrue(result != null);
    }

}
package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclaration_returnsXmlDeclarationForValidData {

    private Appendable accum = new StringBuilder();

    @Test
    public void asXmlDeclaration_returnsXmlDeclarationForValidData() throws IOException {
        String fragment = "<Hello World!";
        Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(fragment, null);
        Comment comment (this, accum);
        XmlDeclaration decl = asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.tag().equals("Hello"));
    }

}
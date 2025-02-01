package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        try {
            // Forcing unexpected token type
            xmlTreeBuilder.process(new Token.Reset());
            fail("Expected an ValidateException to be thrown");
        } catch (Validate.ValidateException e) {
            assertEquals("Unexpected token type: Reset", e.getMessage());
        }
    }

}
package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag("tag");

        builder.stack.add(new Element("tag"));
        builder.popStackToClose(endTag);

        assertTrue(builder.stack.isEmpty());
    }

}
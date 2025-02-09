package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Character("test"));
        assertTrue(xmlTreeBuilder.getStack().size() > 0);
    }

}
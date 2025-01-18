package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTokenCharacterTest {

    @Test
    public void processTokenCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character().data("dummyData");
        boolean processed = xmlTreeBuilder.process(character);
        assertTrue(processed);
    }

}
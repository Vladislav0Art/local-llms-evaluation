package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Character("Character"));

        assertNotNull(xmlTreeBuilder);
    }

}
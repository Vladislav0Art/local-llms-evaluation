package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.data("data");
        treeBuilder.insert(characterToken);
    }

}
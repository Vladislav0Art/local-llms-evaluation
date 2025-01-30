package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Token;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.data("Tove");
        Assert.assertTrue(treeBuilder.process(character));
    }

}
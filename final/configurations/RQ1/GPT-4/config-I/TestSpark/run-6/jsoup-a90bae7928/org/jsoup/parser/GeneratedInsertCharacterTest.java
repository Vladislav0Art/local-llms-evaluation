package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Character tokenCharacter = new Token.Character();
        tokenCharacter.data("CharData");
        tokenCharacter.cdata(true);
        builder.insert(tokenCharacter);
        Assert.assertEquals(CDataNode.class, builder.getStack().get(0).childNode(0).getClass());
    }

}
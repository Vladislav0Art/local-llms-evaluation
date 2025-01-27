package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedProcess_Character {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.parser(XmlTreeBuilderTest");
    }

    @Test
    public void process_Character() {
        Token token = new Token(Token.Character, '!');
        XmlTreeBuilder builder = new XmlTreeBuilder();
        boolean result = builder.process(token);
        assertTrue(result);
    }

}
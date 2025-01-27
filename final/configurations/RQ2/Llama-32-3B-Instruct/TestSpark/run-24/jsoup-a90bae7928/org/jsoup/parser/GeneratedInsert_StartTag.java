package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedInsert_StartTag {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.parser.XmlTreeBuilderTest");
    }

    @Test
    public void insert_StartTag() {
        Token startTag = new Token(Token.Type.START_TAG, "tag");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = builder.insert(startTag);
        assertNotNull(element);
    }

}
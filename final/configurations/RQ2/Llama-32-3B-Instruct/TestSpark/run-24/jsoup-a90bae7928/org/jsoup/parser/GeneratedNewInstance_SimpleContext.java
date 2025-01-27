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

public class GeneratedNewInstance_SimpleContext {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.parser(XmlTreeBuilderTest");
    }

    @Test
    public void newInstance_SimpleContext() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder newNode = builder.newInstance();
        assertNotSame(builder, newNode);
    }

}
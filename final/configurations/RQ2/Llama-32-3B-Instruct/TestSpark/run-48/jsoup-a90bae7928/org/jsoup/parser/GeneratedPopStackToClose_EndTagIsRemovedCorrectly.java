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
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;

public class GeneratedPopStackToClose_EndTagIsRemovedCorrectly {

    private XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

    @Test
    public void popStackToClose_EndTagIsRemovedCorrectly() {
        Token endTag = new Token();
        treeBuilder.popStackToClose(endTag);
        assertNull(treeBuilder.stack().isEmpty());
    }
}

public class Token {
    private String type;
    private Character value;

    public Token() {
    }

    public Token(String type) {
        this.type = type;
    }

    public Token(String type, Character value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }
}

public class DocumentType {
    private String name;

    public DocumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
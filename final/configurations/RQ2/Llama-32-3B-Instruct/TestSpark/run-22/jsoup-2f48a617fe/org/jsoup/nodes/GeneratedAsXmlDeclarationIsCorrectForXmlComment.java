package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public class GeneratedAsXmlDeclarationIsCorrectForXmlComment {

    @Test
    public void asXmlDeclarationIsCorrectForXmlComment() {
        Element element = new Element("xml");
        XmlDeclaration xmlDeclaration = new XmlDeclaration("test", "test");
        element.asXmlDeclaration(xmlDeclaration);
        Comment comment = new Comment("");
        comment.setData("<!-- " + xmlDeclaration.getDeclaration() + " -->");
        assertThat(comment.asXmlDeclaration().getDeclaration(), is(xmlDeclaration.getDeclaration()));
    }

}
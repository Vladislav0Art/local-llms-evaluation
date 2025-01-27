package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.Reader;
import java.util.List;

public class GeneratedInsert_doctypeInsertCorrectly {

    @Test
    public void insert_doctypeInsertCorrectly() {
        // Arrange nothing
        Token.Doctype d = new Token.Doctype();
        treeBuilder.insert(d);

        // Assert that return values are correct
        Validate.notNull(d);
    }

}
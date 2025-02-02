package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers.*;

@RunWith(JUnit4.class)
public class GeneratedAsXmlDeclaration_returnsValidDeclarationWhenDataIsValid {

    @Test
    public void asXmlDeclaration_returnsValidDeclarationWhenDataIsValid() throws Exception {
        String fragment = "<!DOCTYPE html>";
        Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(fragment, null);
        Comment comment = new Comment(doc.body().child(0).tagName());
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertThat(declaration, not(nullValue()));
    }

    private static String notNull(Object obj) {
        return obj != null ? obj.toString() : "null";
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.BeforeEach;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTest_comment_as_xml_declaration {

    public static final CommentCommentData DATA = new CommentCommentData("test");

    private Comment comment;

    @BeforeEach
    void setup() {
        comment = new Comment(DATA.getData());
    }

    @Test
    public void test_comment_as_xml_declaration() throws IOException {
        Document document = new Document();
        Comment commentAsXmlDeclaration = (Comment) document.createElement("comment").asXmlDeclaration();
        assertNotNull(commentAsXmlDeclaration);
    }
}

class CommentCommentData {

    private String data;

    public CommentCommentData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}
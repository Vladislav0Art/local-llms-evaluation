package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedTest {

    @Test
    public void nodeName_test() {
        Comment comment = new Comment("This is a test");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData_test() {
        Document document = new Document();
        document.appendChild(new Comment("This is a test"));
        Supplier<String> getter = () -> (String) getComment().getData();
        assertEquals("test", getter.get());
    }

    @Test
    public void setData_test() {
        Comment comment = new Comment("This is a test");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void outerHtmlHead_test() throws IOException {
        Document document = new Document();
        Parser parser = document.createParser(Parser.OUTPUT);
        outerHtmlHeadHead(parser, 0, null);
        assertEquals("", (String) getComment().outerHtmlHead(parser, 0, null).toCharArray());
    }

    @Test
    public void outerHtmlTail_test() throws IOException {
        Document document = new Document();
        Parser parser = document.createParser(Parser.OUTPUT);
        outerHtmlTailTail(parser, 1, null);
        assertEquals("", (String) getComment().outerHtmlTail(parser, 1, null).toCharArray());
    }

    @Test
    public void toString_test() {
        Comment comment = new Comment("This is a test");
        assertEquals("<comment>", comment.toString());
    }

    @Test
    public void clone_test() {
        Comment comment = new Comment("This is a test");
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

    @Test
    public void isXmlDeclaration_test() {
        Comment comment = new Comment("<xml><data/></xml>");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_test() {
        Comment comment = new Comment("This is a test");
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertEquals("<comment>", xmlDeclaration.toString());
    }

}
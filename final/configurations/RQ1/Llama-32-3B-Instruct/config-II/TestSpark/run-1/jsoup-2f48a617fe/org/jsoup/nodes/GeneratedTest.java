package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void create_new_comment_node_with_data() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void get_node_name_returns_correct_value() {
        Comment comment = new Comment("This is a comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void get_data_returns_comment_contents() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void set_data_sets_comment_contents_correctly() {
        Comment comment = new Comment("This is a comment");
        comment.setData("New comment data");
        assertEquals("New comment data", comment.getData());
    }

    @Test
    public void outer_html_head_appends_comment_to_accumulator_if_pretty_printed() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(false);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<!--This is a comment-->\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void outer_html_head_does_not_append_to_accumulator_if_not_pretty_printed() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(false);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlHead(accum, 0, out);
        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void outer_html_head_appends_comment_to_accumulator_even_if_not_pretty_printed() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(false);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<!--This is a comment-->\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void outer_html_tail_does_not_append_to_accumulator() {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(false);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlTail(accum, 0, out);
        String expectedOutput = "";
        assertEquals(expectedOutput, accum.toString());
    }

    @Test
    public void clone_returns_correct_comment_node() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals("#comment", clonedComment.nodeName());
        assertEquals("This is a comment", clonedComment.getData());
    }

    @Test
    public void is_xml_declaration_returns_true_if_comment_startsWith() {
        Comment comment = new Comment("!XML Declaration");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void is_xml_declaration_returns_false_if_not_starting_with() {
        Comment comment = new Comment("This is a comment");
        assertFalse(comment.isXmlDeclaration());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHead_setsCorrectDataForComment {

    @Test
    public void outerHtmlHead_setsCorrectDataForComment() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        String expectedOutput = "<!-- data -->\n";
        assertTrue(comment.outerHtmlHead(bos, 0, out).equals(expectedOutput));
    }
}

public class Comment {

    public static String outerHtmlHead(String value) {
        return "<!-- " + value + " -->\n";
    }

    public static boolean isXmlDeclaration() {
        return false;
    }

    public static String asXmlDeclaration() {
        return "";
    }

    public static void outerHtmlTail(ByteArrayOutputStream bos, int index, Document.OutputSettings out) {

    }

    public static String outerHtmlHead(ByteArrayOutputStream bos, int index, Document.OutputSettings out) {
        // implementation
    }

}
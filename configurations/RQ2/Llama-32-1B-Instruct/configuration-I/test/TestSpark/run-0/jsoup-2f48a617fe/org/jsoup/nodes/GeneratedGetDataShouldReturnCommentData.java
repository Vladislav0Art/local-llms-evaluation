package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedGetDataShouldReturnCommentData {

    public static void main(String[] args) {
        Comment comment = new Comment("This is another comment.");
        Document document = comment.outerHtml();
    }

    @Test
    public void getDataShouldReturnCommentData() {
        assertEquals("This is a comment.", comment.getData());
    }

}
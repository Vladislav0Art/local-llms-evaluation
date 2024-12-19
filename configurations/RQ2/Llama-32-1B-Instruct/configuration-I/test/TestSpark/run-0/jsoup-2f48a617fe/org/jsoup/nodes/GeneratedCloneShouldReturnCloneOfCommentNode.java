package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCloneShouldReturnCloneOfCommentNode {

    public static void main(String[] args) {
        Comment comment = new Comment("This is another comment.");
        Document document = comment.outerHtml();
    }

    @Test
    public void cloneShouldReturnCloneOfCommentNode() {
        Object original = comment.clone();
        Element clone = (Element) ((Document) ((Document) document).body()).childAt(0);

        assert clone instanceof Comment;
    }

}
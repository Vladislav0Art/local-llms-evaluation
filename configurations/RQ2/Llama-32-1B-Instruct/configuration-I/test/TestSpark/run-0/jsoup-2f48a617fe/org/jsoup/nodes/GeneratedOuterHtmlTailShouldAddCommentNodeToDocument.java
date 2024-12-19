package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedOuterHtmlTailShouldAddCommentNodeToDocument {

    public static void main(String[] args) {
        Comment comment = new Comment("This is another comment.");
        Document document = comment.outerHtml();
    }

    @Test
    public void outerHtmlTailShouldAddCommentNodeToDocument() throws IOException {
        Document document = new Document();
        Appendable accum = (Appendable) document.getOutputSettings().append();

        comment.outerHtmlTail(accum, 1, document);
        Element node = (Element) ((Document) document).body().childAt(0);

        assert node instanceof Comment;
    }

}
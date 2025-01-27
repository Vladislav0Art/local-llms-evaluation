package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void commentConstructorTest() {
        Comment comment = new Comment("data");
        assert comment.getData().equals("data");
    }

    @Test
    public void commentNodeNameTest() {
        Comment comment = new Comment("");
        assert comment.nodeName().isEmpty();
    }

    @Test
    public void commentDataTest() {
        Comment comment = new Comment("data");
        assert comment.getData().equals("data");

        Comment newComment = new Comment(comment.getData());
        assert newComment.getData().equals("data");
    }

    @Test
    public void commentGetDataTest() {
        Comment comment = new Comment("");
        assert comment.getData().isEmpty();
    }

    @Test
    public void commentSetDataTest() {
        Comment comment = new Comment("");
        comment.setData("data");

        assert comment.getData().equals("data");
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        assert comment.toString().contains("data");
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assert clonedComment != null;
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("");
        assert !comment.isXmlDeclaration();
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("");
        assert comment.asXmlDeclaration() == null;
    }

}
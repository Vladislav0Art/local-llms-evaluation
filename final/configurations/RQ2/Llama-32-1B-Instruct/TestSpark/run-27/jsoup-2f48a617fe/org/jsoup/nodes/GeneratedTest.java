package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    public static String generateComment(String content) {
        return "<comment>" + content + "</comment>";
    }

    @Test
    public void nodeName_ReturnsCommentNode() {
        Comment comment = new Comment(generateComment("This is a test comment"));
        Assert.assertEquals("Comment", comment.nodeName());
    }

    @Test
    public void getData_ReturnsCommentData() {
        Comment comment = new Comment(generateComment("This is a test comment"));
        String data = comment.getData();
        Assert.assertEquals(content, data);
    }

    @Test
    public void getFirstChild_ReturnsNextSibling() {
        Comment root = new Comment(generateComment("First child"));
        root.appendChild(new Comment(generateComment("Second child")));
        Comment child1 = (Comment) root.getFirst();
        Comment child2 = (Comment) root.getNextSibling();

        Assert.assertEquals(child1, child2);
    }

    @Test
    public void getFirstChild_ReturnsNextSiblingIfNoChildren() {
        Comment root = new Comment(generateComment("This is a test comment"));
        Comment child = (Comment) root.getFirst();

        Assert.assertEquals(child, child2); // Assuming there's only one sibling element
    }

    @Test
    public void getNextSibling_ReturnsPreviousSibling() {
        Comment root = new Comment(generateComment("First child"));
        root.appendChild(new Comment(generateComment("Second child")));
        Comment child1 = (Comment) root.getNextSibling();
        Comment child2 = (Comment) root.getPrevSibling();

        Assert.assertEquals(child2, child1);
    }

    @Test
    public void getNextSibling_ReturnsPreviousSiblingIfNoChildren() {
        Comment root = new Comment(generateComment("This is a test comment"));
        Comment child = (Comment) root.getNextSibling();

        Assert.assertEquals(root, child); // Assuming there's only one sibling element
    }

    @Test
    public void getPreviousSibling_ReturnsNextSibling() {
        Comment root = new Comment(generateComment("First child"));
        root.appendChild(new Comment(generateComment("Second child")));
        Comment child1 = (Comment) root.getPrevSibling();
        Comment child2 = (Comment) root.getNextSibling();

        Assert.assertEquals(child2, child1);
    }

    @Test
    public void getPreviousSibling_ReturnsNextSiblingIfNoChildren() {
        Comment root = new Comment(generateComment("This is a test comment"));
        Comment child = (Comment) root.getPrevSibling();

        Assert.assertEquals(root, child); // Assuming there's only one sibling element
    }

    @Test
    public void appendChild_ReturnsNewNode() {
        Comment parent = new Comment(generateComment("Parent"));
        Comment child = new Comment(generateComment("Child"));

        parent.appendChild(child);
        Assert.assertEquals(child, child2);

        parent = new Comment(generateComment("Grandparent"));

        parent.appendChild(parent.getPreviousSibling());
    }

    @Test
    public void removeChild_ReturnsNull() {
        Comment root = new Comment(generateComment("This is a test comment"));
        Comment grandchild = (Comment) root.getFirst();

        root.removeChild(grandchild);

        Assert.assertNull(root);
    }

}
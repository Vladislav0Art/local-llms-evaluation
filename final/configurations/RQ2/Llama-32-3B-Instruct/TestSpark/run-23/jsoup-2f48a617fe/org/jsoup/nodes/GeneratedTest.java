package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void constructorWithDataTest() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
        assertEquals("data", comment.getData());
    }

    @Test
    public void getDataWithoutDataTest() {
        Comment comment = new Comment(null);
        assertNull(comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("COMMENT", comment.nodeName());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment(null);
        String data = "newData";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment(null);
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void commentConstructorWithDataTest() throws Exception {
        Comment comment = new Comment("data");
        assertNotNull(comment);
        assertEquals("data", comment.getData());
    }

    @Test
    public void commentConstructorWithoutDataShouldBeNull() throws Exception {
        Comment comment = new Comment(null);
        assertNull(comment.getData());
    }

}
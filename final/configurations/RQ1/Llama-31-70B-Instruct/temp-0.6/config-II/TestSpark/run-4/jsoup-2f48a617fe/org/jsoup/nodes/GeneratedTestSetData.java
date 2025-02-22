package org.jsoup.nodes;

public class GeneratedTestSetData {

    Comment comment;

    @BeforeEach
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testSetData() {
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}
package org.jsoup.nodes;

public class GeneratedTestGetData {

    Comment comment;

    @BeforeEach
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testGetData() {
        assertEquals("test", comment.getData());
    }

}
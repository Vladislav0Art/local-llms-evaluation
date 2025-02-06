package org.jsoup.nodes;

public class GeneratedConstructorHasCorrectData {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void constructorHasCorrectData() {
        assertEquals("data", comment.getData());
    }

}
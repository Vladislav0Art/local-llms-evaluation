package org.jsoup.nodes;

public class GeneratedToStringReturnsExpectedString {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void toStringReturnsExpectedString() {
        String expectedString = "<!-- data -->";
        assertEquals(expectedString, comment.toString());
    }

}
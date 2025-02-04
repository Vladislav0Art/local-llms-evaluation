package org.jsoup.nodes;

public class GeneratedDataIsPreservedInDataMethod {

    @Test
    public void dataIsPreservedInDataMethod() {
        Comment comment = new Comment(" <!-- comment --> ");
        assertEquals("<!-- comment -->", comment.getData());
    }

}
package org.jsoup.nodes;

public class GeneratedDataShouldBeRetrievedFromCoreValue {

    @Test
    public void dataShouldBeRetrievedFromCoreValue() {
        String data = "This is a test";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getCoreValue());
    }

}
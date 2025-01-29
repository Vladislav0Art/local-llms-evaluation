package org.jsoup.nodes;

public class GeneratedIsDocParseable {

    @Test
    public void isDocParseable() {
        String docString = "<!DOCTYPE html><html></html>";
        Comment comment = new Comment(docString);
        assert isDocParseable(docString);
    }
}

}
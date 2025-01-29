package org.jsoup.nodes;

public class GeneratedDocToString {

    @Test
    public void docToString() {
        String docString = "<!DOCTYPE html><html></html>";
        Tag tag = new Tag("test");
        Document document = new Document();
        document.addTag(tag);
        commentToString(document);
    }

}
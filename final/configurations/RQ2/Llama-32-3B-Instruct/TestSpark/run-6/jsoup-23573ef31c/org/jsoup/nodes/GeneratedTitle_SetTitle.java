package org.jsoup.nodes;

public class GeneratedTitle_SetTitle {

    @Test
    public void title_SetTitle() {
        String html = "<html><head><title>Document</title></head></html>";
        Document document = new Document(html);
        document.title("New Title");
        assertEquals("New Title", document.title());
    }
}

}
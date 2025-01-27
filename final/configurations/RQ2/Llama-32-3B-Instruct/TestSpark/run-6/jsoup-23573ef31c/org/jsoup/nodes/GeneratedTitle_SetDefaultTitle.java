package org.jsoup.nodes;

public class GeneratedTitle_SetDefaultTitle {

    @Test
    public void title_SetDefaultTitle() {
        String html = "<html><title>Document</title></html>";
        Document document = new Document(html);
        assertEquals("Document", document.title());
    }

}
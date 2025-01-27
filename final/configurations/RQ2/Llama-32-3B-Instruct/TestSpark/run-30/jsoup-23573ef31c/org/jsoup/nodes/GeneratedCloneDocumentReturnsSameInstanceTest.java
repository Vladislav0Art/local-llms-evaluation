package org.jsoup.nodes;

public class GeneratedCloneDocumentReturnsSameInstanceTest {

    @Test
    public void cloneDocumentReturnsSameInstanceTest() {
        Document document = new Document("https://www.example.com");
        Document cloned = document.clone();
        assertSame(document, cloned);
    }

}
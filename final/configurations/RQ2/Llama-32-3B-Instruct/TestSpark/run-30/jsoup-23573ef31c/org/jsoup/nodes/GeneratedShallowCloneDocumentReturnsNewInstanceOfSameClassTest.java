package org.jsoup.nodes;

public class GeneratedShallowCloneDocumentReturnsNewInstanceOfSameClassTest {

    @Test
    public void shallowCloneDocumentReturnsNewInstanceOfSameClassTest() throws Exception {
        Document document = new Document("https://www.example.com");
        Document cloned = document.shallowClone();
        assertTrue(cloned instanceof Document);
        assertEquals(1, cloned.toString().split(",").length);
    }

}
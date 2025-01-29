package org.jsoup.nodes;

public class GeneratedTest_shallowClone {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_shallowClone() {
        Document document = new Document(BASE_URI);
        Object shallowClone = document.shallowClone();
        assertEquals(document, (Object) shallowClone);
    }
}

}
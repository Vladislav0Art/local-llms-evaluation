package org.jsoup.nodes;

public class GeneratedTestTitle {

    private Document document;

    @Test
    public void testTitle() {
        // Test title method of Document class
        String expected = "title";
        String actual = document.title();
        assertEquals(expected, actual);
    }

}
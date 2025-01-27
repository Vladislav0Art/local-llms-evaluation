package org.jsoup.nodes;

public class GeneratedLocationReturnEmptyStringTest {

    @Test
    public void locationReturnEmptyStringTest() {
        Document document = Document.createShell("");
        assertEquals("", document.location());
    }

}
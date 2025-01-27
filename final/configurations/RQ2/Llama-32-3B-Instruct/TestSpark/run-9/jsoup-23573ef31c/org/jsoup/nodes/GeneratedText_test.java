package org.jsoup.nodes;

public class GeneratedText_test {

    @Test
    public void text_test() {
        String text = "Hello World!";
        Document document = new Document("http://example.com");
        Element element = mock(Element.class);
        when(element.nodeName()).thenReturn("");
        document.text(text, element);
        assertEquals(text, element.text());
    }

}
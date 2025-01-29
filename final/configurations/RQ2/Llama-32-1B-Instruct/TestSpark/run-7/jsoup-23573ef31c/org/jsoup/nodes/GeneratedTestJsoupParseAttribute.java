package org.jsoup.nodes;

public class GeneratedTestJsoupParseAttribute {

    @Test
    public void testJsoupParseAttribute() {
        assertEquals("Hello, World!", Jsoup.parse("<p>Hello, World!</p>", "author='John Doe'")).text();
    }

}
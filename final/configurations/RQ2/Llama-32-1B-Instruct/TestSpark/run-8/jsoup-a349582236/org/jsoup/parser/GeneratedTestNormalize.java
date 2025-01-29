package org.jsoup.parser;

public class GeneratedTestNormalize {

    @Test
    public void testNormalize() {
        String tagName = "my_tag";
        String expected = "name";
        String actual = Normalizer.normalize(tagName, Normalizer.NFD);
        assertEquals(expected, actual);
    }

}
package org.jsoup.parser;

public class GeneratedTestUnnormalize {

    @Test
    public void testUnnormalize() {
        Tag tag = new Tag();
        String name = "name";
        String expected = tagName;
        String actual = tag.name();
        assertNotEquals(expected, actual);
        assertEquals(name, Normalizer.normalize(tag.name(), Normalizer.NFD));
    }
}

}
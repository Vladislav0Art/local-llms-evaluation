package org.jsoup.parser;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        Tag tag = new Tag();
        String expected = "name";
        String actual = tag.normalName();
        assertNotEquals(expected, actual);
        assertEquals(expected, Normalizer.normalize(tag.name(), Normalizer.NFD));
    }

}
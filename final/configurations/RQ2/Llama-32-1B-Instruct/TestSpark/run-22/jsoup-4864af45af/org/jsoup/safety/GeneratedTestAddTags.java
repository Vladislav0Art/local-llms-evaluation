package org.jsoup.safety;

public class GeneratedTestAddTags {

    @Test
    public void testAddTags() {
        Safelist safeList = new Safelist();
        safeList.addTags("tag1", "tag2");
        assertEquals("tag1, tag2", safeList.getEnforcedAttributes("a"));
    }

}
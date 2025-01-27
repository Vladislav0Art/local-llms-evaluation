package org.jsoup.safety;

public class GeneratedTestAddTags {

    @Test
    public void testAddTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        assertEquals(2, safelist.safeTags.size());
    }

}
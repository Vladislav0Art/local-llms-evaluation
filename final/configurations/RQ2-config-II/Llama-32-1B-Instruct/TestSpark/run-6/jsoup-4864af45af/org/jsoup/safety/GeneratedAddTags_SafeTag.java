package org.jsoup.safety;

public class GeneratedAddTags_SafeTag {

    @Test
    public void addTags_SafeTag() {
        Safelist result = new Safelist();
        String tag = "a";
        result.addTags(tag);
        assertTrue(result.isSafeTag(tag));
        assertEquals("a", result.getEnforcedAttributes(tag).iterator().next().getKey());
    }

}
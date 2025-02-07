package org.jsoup.safety;

public class GeneratedRemoveTags_SafeTag {

    @Test
    public void removeTags_SafeTag() {
        Safelist result = new Safelist();
        String tag = "a";
        result.removeTags(tag);
        assertFalse(result.isSafeTag(tag));
        assertEquals("", result.getEnforcedAttributes(tag).iterator().next().getKey());
    }

}
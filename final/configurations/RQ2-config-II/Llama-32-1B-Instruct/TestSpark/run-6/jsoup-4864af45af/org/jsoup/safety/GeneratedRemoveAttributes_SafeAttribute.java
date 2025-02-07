package org.jsoup.safety;

public class GeneratedRemoveAttributes_SafeAttribute {

    @Test
    public void removeAttributes_SafeAttribute() {
        Safelist result = new Safelist();
        Element el = new Element("p");
        String tagName = "a";
        assertTrue(result.removeAttributes(tagName, "href"));
        assertEquals("", result.getEnforcedAttributes(tagName).iterator().next().getKey());
    }

}
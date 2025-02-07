package org.jsoup.safety;

public class GeneratedAddAttributes_SafeAttribute {

    @Test
    public void addAttributes_SafeAttribute() {
        Safelist result = new Safelist();
        Element el = new Element("p");
        String tagName = "a";
        assertTrue(result.addAttributes(tagName, "href"));
        assertEquals("href", result.getEnforcedAttributes(tagName).iterator().next().getKey());
    }

}
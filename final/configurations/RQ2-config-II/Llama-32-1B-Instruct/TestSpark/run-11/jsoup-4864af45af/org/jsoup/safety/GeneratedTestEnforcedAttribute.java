package org.jsoup.safety;

public class GeneratedTestEnforcedAttribute {

    @Test
    public void testEnforcedAttribute() throws Exception {
        Safelist enforcedAttribute = Safelist.enforcedAttribute("a", "class", "");
        assertTrue(enforcedAttribute.hasAttribute("class"));
    }

}
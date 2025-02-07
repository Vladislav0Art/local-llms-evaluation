package org.jsoup.safety;

public class GeneratedTestAddEnforcedAttribute {

    @Test
    public void testAddEnforcedAttribute() throws Exception {
        Safelist addEnforcedAttribute = new Safelist();
        addEnforcedAttribute.addEnforcedAttribute("a", "class", "");
        assertTrue(addEnforcedAttribute.hasAttribute("class"));
    }

}
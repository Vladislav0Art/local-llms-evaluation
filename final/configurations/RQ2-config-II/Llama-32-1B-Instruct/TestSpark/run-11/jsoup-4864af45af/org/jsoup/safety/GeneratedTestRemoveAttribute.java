package org.jsoup.safety;

public class GeneratedTestRemoveAttribute {

    @Test
    public void testRemoveAttribute() throws Exception {
        Safelist removeAttribute = Safelist.removeAttributes("img");
        assertEquals(org.jsoup.safety.Safelist.NONE, removeAttribute);
    }

}
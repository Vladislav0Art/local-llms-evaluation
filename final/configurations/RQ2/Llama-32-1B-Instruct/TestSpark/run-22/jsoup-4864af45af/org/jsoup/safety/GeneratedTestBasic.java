package org.jsoup.safety;

public class GeneratedTestBasic {

    @Test
    public void testBasic() {
        Safelist basic = org.jsoup.safety.Safelist.basic();
        assertEquals("basic", basic.getEnforcedAttributes("a"));
    }

}
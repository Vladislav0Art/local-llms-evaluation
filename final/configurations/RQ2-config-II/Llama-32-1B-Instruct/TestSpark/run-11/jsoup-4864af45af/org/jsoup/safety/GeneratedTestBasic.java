package org.jsoup.safety;

public class GeneratedTestBasic {

    @Test
    public void testBasic() throws Exception {
        Safelist basic = Safelist.basic();
        assertNotNull(basic);
        assertTrue(basic.isSafeTag("p"));
        assertFalse(basic.isSafeTag("img"));
    }

}
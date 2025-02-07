package org.jsoup.safety;

public class GeneratedTestRemoveProtocols {

    @Test
    public void testRemoveProtocols() throws Exception {
        Safelist removeProtocols = Safelist.removeProtocols("img");
        assertEquals(org.jsoup.safety.Safelist.NONE, removeProtocols);
    }

}
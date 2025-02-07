package org.jsoup.safety;

public class GeneratedTestRelaxed {

    @Test
    public void testRelaxed() throws Exception {
        Safelist relaxed = Safelist.relativelySane();
        assertNotNull(relaxed);
        assertTrue(relaxed.isSafeTag("a"));
        assertTrue(relaxed.isSafeTag("img"));
    }

}
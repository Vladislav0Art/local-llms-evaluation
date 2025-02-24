package org.jsoup.safety;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.preserveRelativeLinks());

        safelist.preserveRelativeLinks(false);
        assertFalse(safelist.preserveRelativeLinks());
    }

}
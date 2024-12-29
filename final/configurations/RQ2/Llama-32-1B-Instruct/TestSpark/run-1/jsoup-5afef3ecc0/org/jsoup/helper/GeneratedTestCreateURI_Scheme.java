package org.jsoup.helper;

public class GeneratedTestCreateURI_Scheme {

    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void testCreateURI_Scheme() {
        URI uri = URHelper.createURI("https", null, null, null, null);
        assertEquals(URI.javaVersion(), uri.getScheme());
    }

}
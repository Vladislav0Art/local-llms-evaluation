package org.jsoup.helper;

public class GeneratedTestGetAuthority_Scheme {

    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void testGetAuthority_Scheme() {
        URI uri = URHelper.createURI("https", "example.com", "/path");
        String authority = URHelper.getAuthority(uri);
        assertEquals("example.com", authority);

        URI schemeAuthorityPathUri = URHelper.createURI("https", null, null, null, null);
        String authority = URHelper.getAuthority(schemeAuthorityPathUri);
        assertEquals(null, authority);

        URI pathUri = URHelper.createURI("https", "example.com", "/path");
        String path = "/path";
        URI createdUri = URHelper.createURI("https", null, null, null, null);
        assertEquals(path, createdUri.getPath());
    }

}
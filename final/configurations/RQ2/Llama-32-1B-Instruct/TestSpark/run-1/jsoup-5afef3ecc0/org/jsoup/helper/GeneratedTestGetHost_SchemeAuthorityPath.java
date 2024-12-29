package org.jsoup.helper;

public class GeneratedTestGetHost_SchemeAuthorityPath {

    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void testGetHost_SchemeAuthorityPath() {
        URI schemeAuthorityPathUri = URHelper.createURI("https", "example.com", "/path");
        String authority = URHelper.getAuthority(schemeAuthorityPathUri);
        assertEquals("example.com", authority);

        URI pathUri = URHelper.createURI("https", null, null, null, null);
        String path = "/path";
        URI createdUri = URHelper.createURI("https", authority, path, null, null);
        assertEquals(path, createdUri.getPath());
    }

}
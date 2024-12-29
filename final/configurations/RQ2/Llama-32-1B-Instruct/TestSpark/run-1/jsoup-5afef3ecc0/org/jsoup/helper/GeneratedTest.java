package org.jsoup.helper;

public class GeneratedTest {

    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void testCreateURI_Scheme() {
        URI uri = URHelper.createURI("https", null, null, null, null);
        assertEquals(URI.javaVersion(), uri.getScheme());
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

    @Test
    public void testCreateURI_SchemeAuthorityPath() {
        URI uri = URHelper.createURI("https", "example.com", "/path");
        String authority = URHelper.getAuthority(uri);
        assertEquals("example.com", authority);

        URI pathUri = URHelper.createURI("https", null, null, null, null);
        String path = "/path";
        URI createdUri = URHelper.createURI("https", authority, path, null, null);
        assertEquals(path, createdUri.getPath());
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
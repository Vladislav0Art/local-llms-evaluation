package org.jsoup.helper;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCreateURI {

    public String createURI(String scheme, String authority, String path, String query, String fragment) {
        return new URI(scheme, null, authority, path, null, null, "", null);
    }

    public String getAuthority(String uri) {
        return uri.getHost();
    }
}

class TestURIHelper {
    private static final String URL = "https://example.com/path?param=value";
    private static final URI URI = URI.create(URL);

    @Test
    public void testCreateURI() {
        URI createdUri = URHelper.createURI("https", null, null, null, null);
        assertEquals(URI.javaVersion(), createdUri.getScheme());
        assertEquals(null, createdUri.getAuthority());

        String authority = URHelper.getAuthority(URL);
        assertEquals("example.com", authority);

        path = "/path";
        URI pathUri = URHelper.createURI("https", authority, path, null, null);
        assertEquals(URI.javaVersion(), pathUri.getScheme());
        assertEquals(path, pathUri.getPath());
    }

}
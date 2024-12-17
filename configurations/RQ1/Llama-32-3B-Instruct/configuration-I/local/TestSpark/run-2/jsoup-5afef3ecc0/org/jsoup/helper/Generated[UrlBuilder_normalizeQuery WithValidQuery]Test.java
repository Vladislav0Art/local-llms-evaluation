package org.jsoup.helper;

public class Generated[
UrlBuilder_normalizeQuery WithValidQuery]

Test {

    @Test
    public void [UrlBuilder_normalizeQuery WithValidQuery]Test() {
        String query = "query=value";
        assertEquals("+query=value", normalizeQuery(query));
    }

}
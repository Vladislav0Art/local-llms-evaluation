package org.jsoup.helper;

public class GeneratedTestURLMapper_with_path {

    public String buildString(String baseUrl) {
        return base_url + "?" + buildQuery(baseUrl);
    }

    private String buildQuery(String baseUrl) {
        StringBuilder query = new StringBuilder();
        if (baseUrl.contains("/")) {
            query.append(baseUrl.substring(0, baseUrl.lastIndexOf("/")));
            baseUrl = baseUrl.substring(baseUrl.lastIndexOf("/") + 1);
        }
        query.append("=");
        for (int i = 1; i < baseUrl.length(); i++) {
            if ((baseUrl.charAt(i) - 'a') > 25) {
                query.append((char) (96 + i));
            } else {
                query.append(baseUrl.charAt(i));
            }
        }
        return query.toString();
    }

    @Test
    public void testURLMapper_with_path() throws Exception {
        String[] expectedResult = {"https://example.com", "https://example.com/path"};

        assertEquals(expectedResult[0], buildString("https://example.com"));
        assertEquals(expectedResult[1], buildString("https://example.com/path"));

        when(baseUrl).hasMethod("get").thenReturn(false);
        when(baseUrl).hasAttribute("path").thenReturn(true);

        when(baseUrl).hasAttribute("query").thenReturn(false);
        assertEquals("", buildString("https://example.com/path"));
    }

}
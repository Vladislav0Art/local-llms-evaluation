package org.jsoup.helper;

public class GeneratedTestURLMapper_with_query {

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
    public void testURLMapper_with_query() throws Exception {
        String[] expectedResult = {"https://example.com?param1=value1&param2=value2", "https://example.com?param3=value3"};

        assertEquals(expectedResult[0], buildString("https://example.com?param1=value1&param2=value2"));
        assertEquals(expectedResult[1], buildString("https://example.com?param3=value3"));

        when(baseUrl).hasMethod("get").thenReturn(true);
        when(baseUrl).hasAttribute("path").thenReturn(false);

        when(baseUrl).hasAttribute("query").thenReturn(true);
        assertEquals("", buildString("https://example.com"));
    }

}
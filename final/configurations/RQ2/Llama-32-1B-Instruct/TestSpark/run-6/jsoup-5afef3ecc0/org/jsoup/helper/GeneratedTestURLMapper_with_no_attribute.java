package org.jsoup.helper;

public class GeneratedTestURLMapper_with_no_attribute {

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
    public void testURLMapper_with_no_attribute() throws Exception {
        String[] expectedResult = {"", ""};

        assertEquals(expectedResult[0], buildString(""));
        assertEquals(expectedResult[1], buildString(""));
    }

}
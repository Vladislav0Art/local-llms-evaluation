package org.jsoup.helper;

public class GeneratedTest_2 {

    @Test
    public void test_2() {
        String result = URLEncoder.encode("https://example.com", "key=value&other=other#fragment");
        assertEquals("https://example.com?key=value%26other%3Dother%23fragment", result);
    }
}

public class URLEncoder {

    private static final String PROTOCOL = "https://";
    private static final String SEPARATOR = "=";
    private static final String FRAGMENT_SEPARATOR = "#";

    public static String encode(String url, String params) {
        if (params == null || params.isEmpty()) return url;

        StringBuilder sb = new StringBuilder(url);
        sb.append(SEPARATOR).append(params);

        // Handle special cases
        if (sb.toString().indexOf(FRAGMENT_SEPARATOR) != -1) {
            int fragmentIndex = sb.indexOf(FRAGMENT_SEPARATOR);
            String beforeFragment = sb.substring(0, fragmentIndex);
            String afterFragment = sb.substring(fragmentIndex + 1);
            return PROTOCOL + beforeFragment + SEPARATOR + params + FRAGMENT_SEPARATOR + afterFragment;
        } else {
            return PROTOCOL + sb.toString();
        }
    }

}
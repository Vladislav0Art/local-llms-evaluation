package org.jsoup.helper;

public class GeneratedTest_1 {

    @Test
    public void test_1() {
        String result = URLEncoder.encode("https://example.com", "key=value#fragment");
        assertEquals("https://example.com?key=value%23fragment", result);
    }

}
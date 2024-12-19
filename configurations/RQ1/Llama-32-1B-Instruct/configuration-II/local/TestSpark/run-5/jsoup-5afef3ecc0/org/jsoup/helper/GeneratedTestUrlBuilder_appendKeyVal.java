package org.jsoup.helper;

public class GeneratedTestUrlBuilder_appendKeyVal {

    @Test
    public void testUrlBuilder_appendKeyVal() {
        // Test case for appendKeyVal method with a KeyVal object
        UrlBuilder builder = new URLBuilder(new URI("https://example.com/path?query=value"));
        builder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "bar").value(123));
        String expectedQuery = "foo=bar&expected_key_value";
        assertEquals(expectedQuery, builder.q.toString());
    }

}
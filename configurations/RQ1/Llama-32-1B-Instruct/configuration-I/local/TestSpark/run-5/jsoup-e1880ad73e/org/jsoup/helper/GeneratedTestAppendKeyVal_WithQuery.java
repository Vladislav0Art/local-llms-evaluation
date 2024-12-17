package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithQuery {

    @Test
    public void testAppendKeyVal_WithQuery() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

}
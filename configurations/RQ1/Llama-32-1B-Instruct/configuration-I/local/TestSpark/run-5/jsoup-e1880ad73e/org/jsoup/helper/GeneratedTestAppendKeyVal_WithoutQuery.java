package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithoutQuery {

    @Test
    public void testAppendKeyVal_WithoutQuery() {
        URLBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

}
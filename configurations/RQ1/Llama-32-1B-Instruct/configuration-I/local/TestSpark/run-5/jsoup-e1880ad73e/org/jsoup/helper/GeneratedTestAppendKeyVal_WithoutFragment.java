package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithoutFragment {

    @Test
    public void testAppendKeyVal_WithoutFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

}
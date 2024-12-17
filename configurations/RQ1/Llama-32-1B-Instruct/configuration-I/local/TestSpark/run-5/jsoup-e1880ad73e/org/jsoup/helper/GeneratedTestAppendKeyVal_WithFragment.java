package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithFragment {

    @Test
    public void testAppendKeyVal_WithFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource#anchor");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

}
package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithMultipleQueries {

    @Test
    public void testAppendKeyVal_WithMultipleQueries() {
        URLBuilder builder = new UrlBuilder("https://example.com?query1=value1&query2=value2");
        builder.appendKeyVal(new KeyVal("key1", "value1"));
        builder.appendKeyVal(new KeyVal("key2", "value2"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

}
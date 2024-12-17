package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithMultipleQueryValues {

    @Test
    public void testAppendKeyVal_WithMultipleQueryValues() {
        URLBuilder builder = new UrlBuilder("https://example.com?query1=value1&query2=value2&query3=value3");
        builder.appendKeyVal(new KeyVal("key1", "value1"));
        builder.appendKeyVal(new KeyVal("key2", "value2"));
        builder.appendKeyVal(new KeyVal("key3", "value3"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

}
package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendQuery_StandardEncoding {

    @Test
    public void testUrlBuilderAppendQuery_StandardEncoding() {
        String encodedValue = "value";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue + "?", builder.q.toString());
    }

}
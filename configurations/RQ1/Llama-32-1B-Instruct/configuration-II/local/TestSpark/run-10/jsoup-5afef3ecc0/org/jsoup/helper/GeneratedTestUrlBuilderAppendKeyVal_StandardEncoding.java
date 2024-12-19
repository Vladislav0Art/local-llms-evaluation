package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendKeyVal_StandardEncoding {

    @Test
    public void testUrlBuilderAppendKeyVal_StandardEncoding() {
        String encodedValue = "value";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue, builder.q.toString());
    }

}
package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendFragment_StandardEncoding {

    @Test
    public void testUrlBuilderAppendFragment_StandardEncoding() {
        String encodedValue = "value";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue + "#", builder.q.toString());
    }

}
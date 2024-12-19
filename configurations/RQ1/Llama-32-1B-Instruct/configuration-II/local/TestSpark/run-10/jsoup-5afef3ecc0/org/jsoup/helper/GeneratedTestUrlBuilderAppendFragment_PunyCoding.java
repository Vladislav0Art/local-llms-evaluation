package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendFragment_PunyCoding {

    @Test
    public void testUrlBuilderAppendFragment_PunyCoding() {
        String encodedValue = "%25E8%95%82";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue + "#", builder.q.toString());
    }

}
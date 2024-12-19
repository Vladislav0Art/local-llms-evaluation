package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendQuery_PunyCoding {

    @Test
    public void testUrlBuilderAppendQuery_PunyCoding() {
        String encodedValue = "%25E8%95%82";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue + "?", builder.q.toString());
    }

}
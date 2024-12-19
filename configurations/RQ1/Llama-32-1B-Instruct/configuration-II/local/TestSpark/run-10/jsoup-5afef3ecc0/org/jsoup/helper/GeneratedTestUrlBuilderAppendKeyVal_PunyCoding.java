package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendKeyVal_PunyCoding {

    @Test
    public void testUrlBuilderAppendKeyVal_PunyCoding() {
        String encodedValue = "%25E8%95%82";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals("%25E8%95%82", builder.q.toString());
    }

}
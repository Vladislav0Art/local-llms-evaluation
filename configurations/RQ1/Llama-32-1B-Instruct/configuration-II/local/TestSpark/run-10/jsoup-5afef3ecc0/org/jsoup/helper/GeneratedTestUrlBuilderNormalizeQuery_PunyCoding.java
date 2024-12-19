package org.jsoup.helper;

public class GeneratedTestUrlBuilderNormalizeQuery_PunyCoding {

    @Test
    public void testUrlBuilderNormalizeQuery_PunyCoding() {
        URLBuilder builder = new URLBuilder(null);
        String q = "value";
        builder.appendKeyVal(new Connection.KeyVal("key", q));
        assertEquals(q + "+", builder.normUrl);
    }

}
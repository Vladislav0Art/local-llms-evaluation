package org.jsoup.helper;

public class GeneratedTestUrlBuilderNormalizeRef_PunyCoding {

    @Test
    public void testUrlBuilderNormalizeRef_PunyCoding() {
        URLBuilder builder = new URLBuilder(null);
        String r = "ref";
        builder.appendKeyVal(new Connection.KeyVal("key", r));
        assertEquals(r + "%20", builder.normUrl);
    }

}
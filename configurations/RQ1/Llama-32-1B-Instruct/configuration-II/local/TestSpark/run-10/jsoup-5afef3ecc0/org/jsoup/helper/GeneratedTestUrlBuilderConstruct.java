package org.jsoup.helper;

public class GeneratedTestUrlBuilderConstruct {

    @Test
    public void testUrlBuilderConstruct() {
        URLBuilder builder = new URLBuilder(null);
        assertNotNull(builder.u);

        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("key=value", builder.q.toString());
    }

}
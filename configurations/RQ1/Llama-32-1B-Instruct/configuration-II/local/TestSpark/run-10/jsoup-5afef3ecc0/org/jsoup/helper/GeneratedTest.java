package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testUrlBuilderConstruct() {
        URLBuilder builder = new URLBuilder(null);
        assertNotNull(builder.u);

        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("key=value", builder.q.toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_PunyCoding() {
        String encodedValue = "%25E8%95%82";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals("%25E8%95%82", builder.q.toString());
    }

    @Test
    public void testUrlBuilderAppendKeyVal_StandardEncoding() {
        String encodedValue = "value";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue, builder.q.toString());
    }

    @Test
    public void testUrlBuilderNormalizeQuery_PunyCoding() {
        URLBuilder builder = new URLBuilder(null);
        String q = "value";
        builder.appendKeyVal(new Connection.KeyVal("key", q));
        assertEquals(q + "+", builder.normUrl);
    }

    @Test
    public void testUrlBuilderNormalizeRef_PunyCoding() {
        URLBuilder builder = new URLBuilder(null);
        String r = "ref";
        builder.appendKeyVal(new Connection.KeyVal("key", r));
        assertEquals(r + "%20", builder.normUrl);
    }

    @Test
    public void testUrlBuilderAppendQuery_PunyCoding() {
        String encodedValue = "%25E8%95%82";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue + "?", builder.q.toString());
    }

    @Test
    public void testUrlBuilderAppendQuery_StandardEncoding() {
        String encodedValue = "value";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue + "?", builder.q.toString());
    }

    @Test
    public void testUrlBuilderAppendFragment_PunyCoding() {
        String encodedValue = "%25E8%95%82";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue + "#", builder.q.toString());
    }

    @Test
    public void testUrlBuilderAppendFragment_StandardEncoding() {
        String encodedValue = "value";
        URLBuilder builder = new URLBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", encodedValue));
        assertEquals(encodedValue + "#", builder.q.toString());
    }

}
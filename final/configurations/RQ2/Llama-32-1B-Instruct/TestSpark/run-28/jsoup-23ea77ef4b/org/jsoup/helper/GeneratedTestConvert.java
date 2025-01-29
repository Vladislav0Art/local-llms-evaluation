package org.jsoup.helper;

public class GeneratedTestConvert {

    @Test
    public void testConvert() {
        org.jsoup.nodes.Document in = new Document();
        org.jsoup.nodes.Document out = org.jsoup.helper.W3CDom.convert(in);
        assertTrue(out.tagName().equals("html"));
        assertEquals(1, out.childNodes.getLength());
    }

}
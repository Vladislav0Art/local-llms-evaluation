package org.jsoup.helper;

public class GeneratedNormalizeQuery {

    @Test
    public void normalizeQuery() {
        String q = " query";
        UrlBuilder builder = new UrlBuilder(null);
        builder.q = StringUtil.borrowBuilder().append(q);
        assertEquals("query", UrlBuilder.normalizeQuery(builder.q.toString()));
    }

}
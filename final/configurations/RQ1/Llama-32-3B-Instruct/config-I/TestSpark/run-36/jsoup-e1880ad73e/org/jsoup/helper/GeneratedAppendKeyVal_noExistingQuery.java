package org.jsoup.helper;

public class GeneratedAppendKeyVal_noExistingQuery {

    @Test
    public void appendKeyVal_noExistingQuery() {
        Connection inputUrl = new Connection();
        inputUrl.setPort(8080);
        urlBuilder(inputUrl, "", true);
        assertNull(inputUrl.getQuery());
    }

}
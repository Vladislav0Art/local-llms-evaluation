package org.jsoup.helper;

public class GeneratedAppendKeyVal_emptyKeyVal {

    @Test
    public void appendKeyVal_emptyKeyVal() {
        String url = "https://www.example.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        Connection.KeyVal[] keyVals = {};
        urlBuilder.appendKeyVal(keyVals);
    }

}

public class MockUrlBuilder extends UrlBuilder {

    @Override
    public URL build() {
        return super.build();
    }

}
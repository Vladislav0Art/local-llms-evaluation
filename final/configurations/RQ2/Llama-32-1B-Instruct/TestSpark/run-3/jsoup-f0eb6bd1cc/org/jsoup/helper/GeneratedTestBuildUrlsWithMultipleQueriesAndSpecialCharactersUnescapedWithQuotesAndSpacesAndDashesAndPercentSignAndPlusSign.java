package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestBuildUrlsWithMultipleQueriesAndSpecialCharactersUnescapedWithQuotesAndSpacesAndDashesAndPercentSignAndPlusSign {

    @Test
    public void testBuildUrlsWithMultipleQueriesAndSpecialCharactersUnescapedWithQuotesAndSpacesAndDashesAndPercentSignAndPlusSign() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com? param&#39;3D1&amp;param2=value2");
        assertEquals(new URI("http://example.com?param&#39;=1+&amp;value=1", DataUtil.UTF_8), urlBuilder.build());
    }

}
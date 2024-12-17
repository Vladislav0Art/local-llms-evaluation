package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedBuildWithInvalidProtocol_ThrowsMalformedURLException {

    @Test
    public void buildWithInvalidProtocol_ThrowsMalformedURLException() {
        URL u = new URL("invalid://path/to/resource?query=hello&key=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        try {
            urlBuilder.build();
            assert false;
        } catch (MalformedURLException e) {
            // Expected
        }
    }

}
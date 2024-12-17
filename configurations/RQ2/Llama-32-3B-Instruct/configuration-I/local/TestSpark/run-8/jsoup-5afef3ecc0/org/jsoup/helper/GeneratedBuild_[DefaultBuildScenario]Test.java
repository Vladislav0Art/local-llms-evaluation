package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_[DefaultBuildScenario]

Test {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private URL inputUrl;

    @Test
    public void build_[ DefaultBuildScenario]Test() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}
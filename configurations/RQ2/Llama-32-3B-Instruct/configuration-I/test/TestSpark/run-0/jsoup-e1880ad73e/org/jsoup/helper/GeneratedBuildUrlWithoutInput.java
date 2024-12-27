package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithoutInput {

    private java.util.Map<Object, Object> mockingMap = new java.util.HashMap<>();

    public void addMocking(Object mockObject, Object mockObjectValue) {
        mockingMap.put(mockObject, mockObjectValue);
    }
}

public class UrlBuilderTest {

    private final MockingBean mockingBean = new MockingBean();

    @Test
    public void buildUrlWithoutInput() {
        UrlBuilder builder = urlBuilderInstance();
        URL result = builder.build();
        assertTrue(result == null || result.toString().isEmpty());
    }

}
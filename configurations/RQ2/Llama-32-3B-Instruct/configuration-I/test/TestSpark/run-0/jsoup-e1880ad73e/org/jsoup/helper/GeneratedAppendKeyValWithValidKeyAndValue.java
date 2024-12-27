package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValWithValidKeyAndValue {

    private java.util.Map<Object, Object> mockingMap = new java.util.HashMap<>();

    public void addMocking(Object mockObject, Object mockObjectValue) {
        mockingMap.put(mockObject, mockObjectValue);
    }
}

public class UrlBuilderTest {

    private final MockingBean mockingBean = new MockingBean();

    @Test
    public void appendKeyValWithValidKeyAndValue() throws UnsupportedEncodingException {
        mockingBean.addMocking(kv, new java.util.HashMap<>());
        mockingBean.addMocking("key", "http://example.com");
        UrlBuilder builder = urlBuilderInstance();
        builder.appendKeyVal((java.util.Map<String, String>) mockingBean.getMocking().get("key"));
        assertEquals("http://example.com", ((UrlBuilder) builder).getKeyValue().get("key"));
    }

}
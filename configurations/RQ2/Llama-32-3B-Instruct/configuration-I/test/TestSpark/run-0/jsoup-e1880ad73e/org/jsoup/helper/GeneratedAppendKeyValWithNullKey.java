package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValWithNullKey {

    private java.util.Map<Object, Object> mockingMap = new java.util.HashMap<>();

    public void addMocking(Object mockObject, Object mockObjectValue) {
        mockingMap.put(mockObject, mockObjectValue);
    }
}

public class UrlBuilderTest {

    private final MockingBean mockingBean = new MockingBean();

    @Test
    public void appendKeyValWithNullKey() {
        mockingBean.addMocking(kv, new java.util.HashMap<>());
        mockingBean.addMocking(null, null);
        UrlBuilder builder = urlBuilderInstance();
        try {
            builder.appendKeyVal((java.util.Map<String, String>) mockingBean.getMocking().get("key"));
            assert false : "Expected NullPointerException to be thrown";
        } catch (NullPointerException e) {
        }
    }

    private UrlBuilder urlBuilderInstance() {
        return new UrlBuilder(mockingBean);
    }
}

public class UrlBuilder {

    private final java.util.Map<String, String> keyValue = new java.util.HashMap<>();

    public UrlBuilder(MockingBean mockingBean) {
        this.keyValue.put("key", (String) mockingBean.getMocking().get("http://example.com"));
    }

    public void appendKeyVal(java.util.Map<String, String> map) {
        for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
            keyValue.put(entry.getKey(), entry.getValue());
        }
    }

    public java.util.Map<String, String> getKeyValue() {
        return keyValue;
    }

}
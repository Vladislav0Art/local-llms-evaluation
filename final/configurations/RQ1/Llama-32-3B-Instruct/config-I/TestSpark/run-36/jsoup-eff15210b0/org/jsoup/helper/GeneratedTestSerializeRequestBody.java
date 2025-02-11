package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSerializeRequestBody {

    // ...
}

public class KeyVal implements Connection.KeyVal {
    // ...
}

public interface Connection.

KeyVal {
    String key ();
    void key (String key);
    String value ();
    void value (String value);
    InputStream inputStream ();
    void inputStream (InputStream inputStream);
    boolean hasInputStream ();
    String contentType ();
    void contentType (String contentType);
}

// Tests
import org.junit.Test;
import static org.junit.Assert .*;

public class ConnectionTest {

    @Test
    public void testSerializeRequestBody() throws Exception {
        Connection.Request request = new Connection.Request();
        String requestBody = "{\"key\":\"value\"}";
        RequestBodySerializer serializer = new RequestBodySerializerImpl();
        String serializedRequestBody = serializer.serialize(requestBody);
        assertEquals("key=value", serializedRequestBody);
    }
}

}
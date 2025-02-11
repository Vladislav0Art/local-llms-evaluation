package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSerializeRequest {

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
    public void testSerializeRequest() throws Exception {
        Connection.Request request = new Connection.Request();
        RequestBodySerializer serializer = new RequestBodySerializerImpl();
        String serializedRequest = serializer.serialize(request);
        assertNotNull(serializedRequest);
    }

}
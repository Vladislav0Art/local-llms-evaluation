package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Generated[post][PostRequestWithBodyTest]{

@Test
public void [post][PostRequestWithBodyTest]()throws

IOException {
    String body = "Hello World!";
    Connection conn = HttpConnection.connect("https://example.com");
    conn.request().data("key", body);
    Document document = conn.post();
    assertNotNull(document);
}

}
package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Generated[get][GetRequestWithNoBodyTest]{

@Test
public void [get][GetRequestWithNoBodyTest]()throws IOException,

InterruptedException {
    Connection conn = HttpConnection.connect("https://example.com");
    Document document = conn.get();
    assertNotNull(document);
}

}
package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Generated[timeout][TimeoutWithNoBodyTest]{

@Test
public void [timeout][TimeoutWithNoBodyTest]()throws IOException,

InterruptedException {
    Connection conn = HttpConnection.connect("https://example.com");
    long timeoutMillis = TimeUnit.SECONDS.toMillis(1);
    conn.timeout(timeoutMillis);
    assertTrue(true);
}

}
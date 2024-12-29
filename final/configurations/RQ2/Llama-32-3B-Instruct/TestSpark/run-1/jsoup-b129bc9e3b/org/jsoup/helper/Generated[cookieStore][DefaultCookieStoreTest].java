package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Generated[cookieStore][DefaultCookieStoreTest]{

@Test
public void [cookieStore][DefaultCookieStoreTest](){
CookieManager cookieManager = new CookieManager();
Connection conn = HttpConnection.connect("https://example.com");
		conn.

cookieStore(cookieManager);

assertNotNull(conn);
	}

            }
package org.jsoup.helper;

public class GeneratedTest {

    private MockHttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnect() throws IOException {
        when(mockHttpConnection.connect("http://example.com")).thenReturn(new Connection() {
            @Override
            public Connection url(URL url) {
                return this;
            }
        });

        Connection connection = mockHttpConnection.newRequest();
        assertEquals(HEAD, connection.request().method());

        verify(mockHttpConnection).connect("http://example.com");
    }

    @Test
    public void testConnect_Url() throws IOException {
        when(mockHttpConnection.connect(URL.parseString("http://example.com))).thenReturn(new Connection() {
        @Override
        public URL url (URL url){
            return this;
        }
    });

    Connection connection = mockHttpConnection.newRequest();

    assertEquals(HEAD, connection.request().

    method());

    verify(mockHttpConnection).

    connect("http://example.com");
}

@Test
public void testConnect_Url_Throw() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenThrow(new MalformedURLException());

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (MalformedURLException e) {
        // expected
    }
}

@Test
public void testConnect_Protocol() throws IOException {
    when(mockHttpConnection.connect("http://example.com:443")).thenReturn(new Connection() {
        @Override
        public URL url(URL url) {
            return this;
        }
    });

    Connection connection = mockHttpConnection.newRequest();
    assertEquals(HEAD, connection.request().method());

    verify(mockHttpConnection).connect("http://example.com:443");
}

@Test
public void testConnect_Protocol_Throw() throws IOException {
    when(mockHttpConnection.connect("http://example.com:443")).thenThrow(new MalformedURLException());

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (MalformedURLException e) {
        // expected
    }
}

@Test
public void testConnect_Proxy() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
        @Override
        public URL url(URL url) {
            return this;
        }
    });

    Connection connection = mockHttpConnection.newRequest();
    assertEquals(HEAD, connection.request().method());

    verify(mockHttpConnection).connect(URL.parseString("http://example.com"));
}

@Test
public void testConnect_Proxy_Throw() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenThrow(new MalformedURLException());

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (MalformedURLException e) {
        // expected
    }
}

@Test
public void testConnect_UA() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
        @Override
        public URL url(URL url) {
            return this;
        }
    });

    Connection connection = mockHttpConnection.newRequest();
    assertEquals(HEAD, connection.request().method());

    verify(mockHttpConnection).connect(URL.parseString("http://example.com"));
}

@Test
public void testConnect_UA_Throw() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenThrow(new MalformedURLException());

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (MalformedURLException e) {
        // expected
    }
}

@Test
public void testConnect.

Timeout() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            throw new java.net.SocketTimeoutException();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (SocketTimeoutException e) {
        // expected
    }
}

@Test
public void testConnect_MaxBodySize() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            return new HttpURLConnection();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (IOException e) {
        // expected
    }
}

@Test
public void testConnect_PostDataCharset() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            return new HttpURLConnection();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (IOException e) {
        // expected
    }
}

@Test
public void testResponse() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            return new HttpURLConnection();
        }
    });

    Connection connection = mockHttpConnection.newRequest();
    assertEquals(HEAD, connection.request().method());

    verify(mockHttpConnection).connect(URL.parseString("http://example.com"));
}

@Test
public void testResponse_Throw() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenThrow(new MalformedURLException());

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (MalformedURLException e) {
        // expected
    }
}

@Test
public void testResponse_Protocol() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com:443")).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            return new HttpURLConnection();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (IOException e) {
        // expected
    }
}

@Test
public void testResponse_Protocol_Throw() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com:443")).thenThrow(new MalformedURLException());

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (MalformedURLException e) {
        // expected
    }
}

@Test
public void testResponse_Proxy() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            return new HttpURLConnection();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (IOException e) {
        // expected
    }
}

@Test
public void testResponse_Proxy_Throw() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenThrow(new MalformedURLException());

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (MalformedURLException e) {
        // expected
    }
}

@Test
public void testResponse_UA() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            return new HttpURLConnection();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (IOException e) {
        // expected
    }
}

@Test
public void testResponse_UA_Throw() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenThrow(new MalformedURLException());

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (MalformedURLException e) {
        // expected
    }
}

@Test
public void testResponse.

Timeout() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            throw new java.net.SocketTimeoutException();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (SocketTimeoutException e) {
        // expected
    }
}

@Test
public void testResponse_MaxBodySize() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com"))).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            return new HttpURLConnection();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (IOException e) {
        // expected
    }
}

@Test
public void testResponse_PostDataCharset() throws IOException {
    when(mockHttpConnection.connect(URL.parseString("http://example.com")).thenReturn(new Connection() {
        @Override
        public HttpURLConnection request() {
            return new HttpURLConnection();
        }
    });

    try {
        mockHttpConnection.newRequest();
        fail("Expected exception to be thrown");
    } catch (IOException e) {
        // expected
    }
}

private void testThat() {
    System.out.println("Hello World!");
}

}
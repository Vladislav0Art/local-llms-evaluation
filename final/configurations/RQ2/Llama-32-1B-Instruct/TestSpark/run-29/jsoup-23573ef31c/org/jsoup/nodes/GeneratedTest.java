package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void [MethodUnderTest]

    Test() {
        // TO DO: implement the test method
    }

    @Test
    public void [MethodUnderTest]

    TestShell() {
        Document document = Document.createShell(BASE_URI);
        assertNotNull(document);
        assertEquals(BASE_URI, document.location());
    }

    @Test
    public void [MethodUnderTest]

    TestConnection() {
        Connection connection = Connection.get().open("http://example.com", new String[]{"Accept-Language: en-US"});
        Document document = Document.createDocument(connection);
        assertNotNull(document);
        assertTrue(document.connection() == connection);
    }

    @Test
    public void [MethodUnderTest]

    TestCharset() {
        Document document = Document.createShell(BASE_URI);
        assertEquals("UTF-8", document.charset());
    }

    private static class Document {
        private final Connection connection;

        public Document(String baseUri) throws Exception {
            this.connection = Connection.get().open(baseUri, new String[]{"Accept-Language: en-US"});
        }
    }

    @Test
    public void [MethodUnderTest]

    TestText() {
        Document document = new Document(BASE_URI);
        assertEquals("Hello World!", document.text("Hello World!"));
    }

    @Test
    public void [MethodUnderTest]

    TestQuirksModeNoUpdate() {
        Document document = new Document(BASE_URI);
        assertEquals(0, document.quirksMode().updateMetaCharsetElement());
    }

    @Test
    public void [MethodUnderTest]

    TestQuirksModeUpdateUpdate() {
        QuirksMode quirksMode = new DefaultQuirksMode();
        assertEquals(1, quirksMode.updateMetaCharsetElement());
    }
}

@Test
public void [MethodUnderTest]

TestParser() {
    Parser parser = new Parser();
    assertEquals(parser, document.parser());
}
	}

@Test
public void [MethodUnderTest]

TestExpectForm() {
    Document document = new Document(BASE_URI);
    assertTrue(document.expectForm("form"));
}

@Test
public void [MethodUnderTest]

TestExpectFormEmptyQuery() {
    Document document = new Document(BASE_URI);
    assertTrue(document.expectForm("") == null);
}
	}

            }
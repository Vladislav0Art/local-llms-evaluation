package org.jsoup.nodes;

@RunWith(JUnit4ClassRunner.class)
public class GeneratedCreateShell_documentCreationFailure {

    @RunWith(JUnit4ClassRunner.class)
    public static class DocumentCreationTest {
        private Document document;

        @Before
        public void setup() {
            document = new Document("");
        }

        @Test
        public void createShell_documentCreationFailure() {
            when(Document.parser()).thenReturn(new Parser(null));
            Document createdDoc = Document.createShell("");
            assertNull(createdDoc);
        }
    }

    public class LocationMethodTest {
        private Document document;

        @Before
        public void setup() {
            document = new Document("");
        }

    }
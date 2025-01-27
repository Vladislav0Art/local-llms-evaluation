package org.jsoup.nodes;

@RunWith(JUnit4ClassRunner.class)
public class GeneratedCreateShell_documentCreationSuccess {

    @RunWith(JUnit4ClassRunner.class)
    public static class DocumentCreationTest {
        private Document document;

        @Before
        public void setup() {
            document = new Document("");
        }

        @Test
        public void createShell_documentCreationSuccess() {
            Document createdDoc = Document.createShell("");
            assertNotNull(createdDoc);
        }

    }
package org.jsoup.nodes;

@RunWith(JUnit4ClassRunner.class)
public class GeneratedText_methodSetsCorrectText {

    @RunWith(JUnit4ClassRunner.class)
    public static class DocumentCreationTest {
        private Document document;

        @Before
        public void setup() {
            document = new Document("");
        }

        @Test
        public void text_methodSetsCorrectText() {
            document.text("newText");
            assertEquals("newText", document.text());
        }

    }
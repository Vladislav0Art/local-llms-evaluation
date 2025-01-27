package org.jsoup.nodes;

@RunWith(JUnit4ClassRunner.class)
public class GeneratedText_methodReturnsCurrentTextIfNone {

    @RunWith(JUnit4ClassRunner.class)
    public static class DocumentCreationTest {
        private Document document;

        @Before
        public void setup() {
            document = new Document("");
        }

        @Test
        public void text_methodReturnsCurrentTextIfNone() {
            assertEquals("", document.text());
        }
    }

}
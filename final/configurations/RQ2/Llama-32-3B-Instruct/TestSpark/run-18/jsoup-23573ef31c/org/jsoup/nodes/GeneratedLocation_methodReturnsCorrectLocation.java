package org.jsoup.nodes;

@RunWith(JUnit4ClassRunner.class)
public class GeneratedLocation_methodReturnsCorrectLocation {

    @RunWith(JUnit4ClassRunner.class)
    public static class DocumentCreationTest {
        private Document document;

        @Before
        public void setup() {
            document = new Document("");
        }

        @Test
        public void location_methodReturnsCorrectLocation() {
            document.location().setUrl("http://example.com");
            assertEquals("http://example.com", document.location().getUrl());
        }

    }
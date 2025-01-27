package org.jsoup.nodes;

@RunWith(JUnit4ClassRunner.class)
public class GeneratedLocation_methodReturnsCurrentTextIfNone {

    @RunWith(JUnit4ClassRunner.class)
    public static class DocumentCreationTest {
        private Document document;

        @Before
        public void setup() {
            document = new Document("");
        }

        @Test
        public void location_methodReturnsCurrentTextIfNone() {
            assertEquals("", document.location().getUrl());
        }
    }

    public class TextMethodTest {
        private Document document;

        @Before
        public void setup() {
            document = new Document("");
        }

    }
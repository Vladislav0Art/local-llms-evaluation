package org.jsoup.nodes;

public class GeneratedTestJsoup {

    @Test
    public void testJsoup() throws Exception {
        String html = "<html><body>Hello World!</body></html>";
        Document document = new Document(html);

        Assert.assertEquals("Hello World!", document.text(""));
        assertEquals(2, document.text().length());
    }
}

public class Jsoup {
    public static class QuirksMode {
        public static final String CONFUSING = "CONFUSING";
    }

    public static class OutputSettings {
        // add settings
    }

    public static class Document {
        private String html;

        public Document(String html) {
            this.html = html;
        }

        public String text(String selector) throws Exception {
            // implement text() method
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Document other = (Document) obj;
            return html.equals(other.html);
        }
    }

    public static class Charset {
        public static final String FOR_NAME = "UTF-8";
    }

}
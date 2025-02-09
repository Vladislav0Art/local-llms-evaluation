package org.jsoup.helper;

public class GeneratedNamespaceAwareSetToTrue ReturnsTrue {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    public boolean namespaceAware() {
        return false;
    }

    public boolean namespaceAware(boolean flag) {
        return flag;
    }

    public static class OutputHtml {
        public String get(String key) {
            return "output html";
        }
    }

    public static class OutputXml {
        public String get(String key) {
            return "output xml";
        }
    }

    @Test
    public void namespaceAwareSetToTrue

    ReturnsTrue() {
        boolean result = namespaceAware(true);
        org.junit.Assert.assertTrue(result);
    }

}
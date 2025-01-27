package org.jsoup.safety;

public class GeneratedTest {

    public static Document parse(String html) {
        return new Jsoup().parse(html);
    }

    public static String[] getAttributes(String tag, Map<String, String[]> safeAttributes) {
        return safeAttributes.get(tag);
    }

    public static boolean isSafeProtocol(String protocol, Map<String, String[]> safeProtocols) {
        for (String safe : safeProtocols.get(protocol)) {
            if (!safe.equals(".*")) {
                return true;
            }
        }
        return false;
    }
}

public class Jsoup {

    public Document parse(String html) {
        // Implement document parsing logic here
        return new Document();
    }

    public static class Document {
        // Document implementation
    }

    public static class Element {
        // Element implementation
    }

    public interface Elements {
        List<Element> select(String selector);
    }
}

public class Test {

    @Test
    public void basicTagTest() {
        assertTrue(Safelist.basic().isSafeTag("html"));
        assertFalse(Safelist.basic().isSafeTag("script"));
    }

    @Test
    public void simpleTextCanBeCopiedTest() {
        Safelist sut1 = Safelist.simpleText();
        Safelist copy = new Safelist(sut1);
        assertEquals(sut1, copy);
    }

}
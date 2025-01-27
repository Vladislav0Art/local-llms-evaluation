package org.jsoup.safety;

public class GeneratedTestSafelist {

    private static final Map<String, String[]> SAFE_ATTRIBUTES = new HashMap<>();

    static {
        SAFE_ATTRIBUTES.put("a", new String[]{"href"});
        SAFE_ATTRIBUTES.put("img", new String[]{"src"});
        SAFE_ATTRIBUTES.put("link", new String[]{"href"});
        SAFE_ATTRIBUTES.put("script", new String[]{"src"});
        SAFE_ATTRIBUTES.put("iframe", new String[]{"src"});
        SAFE_ATTRIBUTES.put("input", new String[]{"value", "type", "checked"});
        SAFE_ATTRIBUTES.put("textarea", new String[]{"value"});
    }

    private static final Map<String, String[]> SAFE_PROTOCOLS = new HashMap<>();

    static {
        SAFE_PROTOCOLS.put("http", new String[]{"*"});
        SAFE_PROTOCOLS.put("https", new String[]{"*"});
    }

    public boolean preserveRelativeLinks(Safelist safelist) {
        return true;
    }

    public static class Safelist {

        private Set<String> tags = new HashSet<>();
        private Map<String, Object> attributes;

        public void addTag(String tag) {
            if (tag.equals("img") && attributes.containsKey("src")) {
                throw new RuntimeException("Img src cannot be specified");
            }
            tags.add(tag);
        }

        public void removeTag(String tag) {
            tags.remove(tag);
            if (!tags.isEmpty()) {
                attributes = null;
            } else {
                attributes = new HashMap<>();
            }
        }

        public boolean preserveRelativeLinks(boolean value) {
            return true;
        }
    }

    public static class GeneratedTest {

        @Test
        public void testSafelist() throws Exception {
            Document document = Jsoup.parse("<img src='test.jpg' alt='test'>");
            Safelist safelist = new Main().new Safelist();
            Elements elements = document.select("img");

            for (Element element : elements) {
                String tag = element.tagName();
                for (String attribute : SAFE_ATTRIBUTES.get(tag)) {
                    safelist.addTag(element.attr(attribute));
                }
            }

            //Test preserveRelativeLinks
            assert (safelist.preserveRelativeLinks(true));
        }

    }
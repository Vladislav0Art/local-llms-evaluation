package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.mockito.Mockito;

public class GeneratedRemoveAttribute_ReturnsFalse {

    @Test
    public void removeAttribute_ReturnsFalse() {
        Safelist result = new Safelist();
        result.removeAttribute("a", "href");
        assertFalse(result.isSafeAttribute("a", "href"));
    }
}

public class Safelist {

    private static final String NONE = "<img><br>";

    private List<String> safeTags = new ArrayList<>();

    public void addSafeTag(String tag) {
        safeTags.add(tag);
    }

    public boolean isSafeTag(String tag) {
        return safeTags.contains(tag);
    }

    private Set<String> relaxedTags = new HashSet<>();
    private Set<String> relaxedAttributes = new HashSet<>();

    public void relaxedTags() {
        this.relaxedTags();
    }

    public void relaxedAttributes() {
        this.relaxedAttributes();
    }

    public void addRelaxedTag(String tag) {
        relaxedTags.add(tag);
    }

    public void relaxAttribute(String key, String value) {
        relaxedAttributes.add(value);
    }

}
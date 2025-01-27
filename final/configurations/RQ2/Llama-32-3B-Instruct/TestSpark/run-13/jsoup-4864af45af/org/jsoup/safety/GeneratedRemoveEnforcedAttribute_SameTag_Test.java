package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveEnforcedAttribute_SameTag_Test {

    @Test
    public void removeEnforcedAttribute_SameTag_Test() {
        Safelist safelist = Safelist.safelist();
        Set<String> tags = new HashSet<>(Arrays.asList("p", "img"));
        safelist = Safelist.addTags(safelist, tags.toArray(new String[0]));
        assertTrue(Safelist.removeProtocols(Safelist.relaxed(), Arrays.asList("http://example.com")).isRelaxed());
    }
}

class Safelist {
    public boolean isSimpleText() {
        return true;
    }

    public static Safelist safelist() {
        return new Safelist();
    }

    public static Safelist addTags(Safelist safelist, String[] tags) {
        return safelist;
    }

    public static Safelist basicWithImages(Safelist safelist) {
        return safelist;
    }

    public boolean isBasic() {
        return true;
    }

    public boolean isRelaxed() {
        return true;
    }

    public static Safelist addTags(Safelist safelist, String[] tags) {
        return safelist;
    }

    public static Safelist relaxed() {
        return new Safelist();
    }

    public static boolean addAttributes(Safelist safelist, String tag, String[] attributes) {
        return safelist;
    }

    public static boolean removeEnforcedAttribute(Safelist safelist, String attribute) {
        return safelist;
    }

    public static boolean preserveRelativeLinks(boolean preserve) {
        return new Safelist();
    }

    public static boolean addProtocols(Safelist safelist, String[] protocols) {
        return safelist;
    }

    public static boolean removeProtocols(Safelist safelist, String[] protocols) {
        return safelist;
    }

}
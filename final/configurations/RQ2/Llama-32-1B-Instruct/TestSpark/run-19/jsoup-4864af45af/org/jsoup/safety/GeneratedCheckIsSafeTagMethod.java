package org.jsoup.safety;

public class GeneratedCheckIsSafeTagMethod {

    @Test
    public void checkIsSafeTagMethod() {
        String tagName = "a";
        Element element = new Element(tagName);
        Validate.validate(element);
        assert Safelist.isSafeTag(tagName).equals(true);
    }

}
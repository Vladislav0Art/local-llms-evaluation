package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.select.Elements.select;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGivenElementAddClassAddsCssClassToElement {

    @Test
    public void givenElementAddClassAddsCssClassToElement() {
        when("className").thenReturn("div-class");
        Element element = new Element();
        element.addClass("class");
        assertThat(select(element, "div.class").size(), is(1));
    }
}

public class Element {

    private String tag;
    private String text;
    private String normalName;

    public Element(String tag) {
        this.tag = tag;
        when("text").thenReturn("");
        when("normalName").thenReturn(tag);
    }

    public String tagName() {
        return tag;
    }

    public String normalName() {
        return normalName;
    }

    public String text() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean hasClass(String className) {
        return "className".equals(className);
    }

    public Element addClass(String className) {
        return this;
    }

    public void removeAttr(String attributeKey) {
    }

    public String html() {
        return "<" + tag + ">" + text + "</" + tag + ">";
    }

    @Override
    public <T extends Appendable> T html(T appendable) {
    }

    public Element clone() {
        return this;
    }

    @Override
    public Element shallowClone() {
    }

    @Override
    protected Element doClone(@Nullable Node parent) {
        return this;
    }

}
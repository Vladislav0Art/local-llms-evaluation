package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNone() {
        Safelist actual = Safelist.none();
        assertNotNull(actual);
    }

    @Test
    public void testSimpleText() {
        Safelist actual = Safelist.simpleText();
        assertNotNull(actual);
    }

    @Test
    public void testBasic() {
        Safelist actual = Safelist.basic();
        assertNotNull(actual);
    }

    @Test
    public void testBasicWithImages() {
        Safelist actual = Safelist.basicWithImages();
        assertNotNull(actual);
    }

    @Test
    public void testRelaxed() {
        Safelist actual = Safelist.relaxed();
        assertNotNull(actual);
    }

    @Test
    public void testConstructor() {
        Safelist actual = new Safelist();
        assertNotNull(actual);
    }

    @Test
    public void testAddTags() {
        Safelist actual = new Safelist();
        Safelist result = actual.addTags("tag1", "tag2");
        assertNotNull(result);
    }

    @Test
    public void testRemoveTags() {
        Safelist actual = new Safelist();
        Safelist result = actual.removeTags("tag1", "tag2");
        assertNotNull(result);
    }

    @Test
    public void testAddAttributes() {
        Safelist actual = new Safelist();
        Safelist result = actual.addAttributes("tag1", "attr1", "attr2");
        assertNotNull(result);
    }

}
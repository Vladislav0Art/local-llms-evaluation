package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testNone() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void testSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

    @Test
    public void testBasic() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

    @Test
    public void testBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

    @Test
    public void testRelaxed() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

    @Test
    public void testAddTags() {
        Safelist safelist = new Safelist();
        String[] tags = {"p", "div"};
        safelist.addTags(tags);
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void testRemoveTags() {
        Safelist safelist = new Safelist();
        String[] tags = {"p", "div"};
        safelist.addTags(tags);
        safelist.removeTags(tags);
        assertFalse(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("div"));
    }

}
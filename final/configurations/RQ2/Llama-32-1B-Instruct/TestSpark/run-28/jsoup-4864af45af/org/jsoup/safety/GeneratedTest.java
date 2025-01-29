package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist none = new Safelist();
        assertTrue(none.isSafeTag(""));
        assertTrue(none.isSafeAttribute("test", "", ""));
    }

    @Test
    public void simpleTextTest() {
        Safelist simpleText = Safelist.simpleText();
        assertFalse(simpleText.isSafeTag("test"));
        assertTrue(simpleText.isSafeAttribute("test", "value", "attribute1=value1"));
        assertFalse(simpleText.isSafeAttribute("test", "", ""));
    }

    @Test
    public void basicTest() {
        Safelist basic = Safelist.basic();
        assertFalse(basic.isSafeTag(""));
        assertFalse(basic.isSafeAttribute("", ""));
        assertTrue(basic.isSafeAttribute("test", "value1", "attribute2=value2"));
    }

    @Test
    public void basicWithImagesTest() {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertFalse(basicWithImages.isSafeTag(""));
        assertFalse(basicWithImages.isSafeAttribute("", ""));
        assertTrue(basicWithImages.isSafeAttribute("test", "value1", "attribute2=value2"));
    }

    @Test
    public void relaxedTest() {
        Safelist relaxed = Safelist.relaxed();
        assertFalse(relaxed.isSafeTag(""));
        assertFalse(relaxed.isSafeAttribute("", ""));
        assertTrue(relaxed.isSafeAttribute("test", "value1", "attribute2=value2"));
    }

    @Test
    public void noneCopyTest() {
        Safelist safeList = new Safelist();
        safeList.copy(safeList);
        assertTrue(safeList.equals(safeList));
    }

    @Test
    public void simpleTextCopyTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("test");
        safeList.removeTags("test");
        assertTrue(safeList.isSafeTag(""));
        assertFalse(safeList.isSafeAttribute("", ""));
    }

    @Test
    public void basicCopyTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("test");
        safeList.removeTags("test");
        assertEquals(safeList.basic(), safeList);
    }

    @Test
    public void basicWithImagesCopyTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("test");
        safeList.removeTags("test");
        assertEquals(safeList.basicWithImages(), safeList);
    }

    @Test
    public void relaxedCopyTest() {
        Safelist safeList = new Safelist();
        safeList.addTags("test");
        safeList.removeTags("test");
        assertTrue(safeList.isSafeTag(""));
        assertFalse(safeList.isSafeAttribute("", ""));
    }

    @Test
    public void noneProtocolsTest() {
        Safelist none = new Safelist();
        none.addProtocols("", "");
        assertTrue(none.preserveRelativeLinks(false));
    }

    @Test
    public void simpleTextProtocolsTest() {
        Safelist safeList = Safelist.simpleText();
        assertFalse(safeList.addProtocols("", ""));
        assertTrue(safeList.addProtocols("", "protocol1=1", "protocol2"));
    }

    @Test
    public void basicProtocolsTest() {
        Safelist safeList = Safelist.basic();
        assertFalse(safeList.addProtocols("", ""));
        assertTrue(safeList.addProtocols("", "protocol1=1", "protocol2"));
    }

    @Test
    public void basicWithImagesProtocolsTest() {
        Safelist safeList = Safelist.basicWithImages();
        assertFalse(safeList.addProtocols("", ""));
        assertTrue(safeList.addProtocols("", "protocol1=1", "protocol2"));
    }

    @Test
    public void relaxedProtocolsTest() {
        Safelist safeList = Safelist.relaxed();
        assertFalse(safeList.addProtocols("", ""));
        assertTrue(safeList.addProtocols("", "protocol1=1", "protocol2"));
    }

}
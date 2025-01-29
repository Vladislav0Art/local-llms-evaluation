package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.BeforeClass;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Map<String, Boolean> selfClosingMap;

    @InjectMocks
    private Tag tag;

    public static String TAG_NAME = "div";

    private static final Map<String, Boolean> DEFAULT_selfClosingMap = new HashMap<>();

    @BeforeClass
    public static void initMock() {
        DefaultTestCase.defaultSelfClosingMap = DEFAULT_selfClosingMap;
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testName() {
        assertEquals("org.jsoup.parser.Tag", tag.getName());
    }

    @Test
    public void testNormalName() {
        // No-op implementation
    }

    @Test
    public void testValueOfTagNameNoSettings() {
        DefaultTestCase.defaultSelfClosingMap.put(selfClosingMap.getKey(), true);
        Tag value = Tag.valueOf("div");
        assertFalse(value.isBlock());
        assertTrue(!value.formatAsBlock());
        assertTrue(!value.isInline());
        assertFalse(value.isEmpty());
        assertFalse(value.isSelfClosing());
        assertTrue(DefaultTestCase.defaultSelfClosingMap.containsKey(selfClosingMap.getKey()));
    }

    @Test
    public void testValueOfTagNameSettings() {
        Map<String, Boolean> settings = new HashMap<>();
        settings.put("selfClosing", true);
        Tag value = Tag.valueOf("div", settings);
        assertEquals(true, value.isBlock());
        assertTrue(value.formatAsBlock());
        assertTrue(value.isInline());
        assertTrue(value.isEmpty());
        assertTrue(!value.isSelfClosing());
        assertTrue(DefaultTestCase.defaultSelfClosingMap.containsKey(selfClosingMap.getKey()));
    }

    @Test
    public void testValueOfTagNameSettingsWithDifferentDefaultValues() {
        Map<String, Boolean> settings = new HashMap<>();
        settings.put("selfClosing", true);
        settings.put("preserveWhitespace", false);
        Tag value = Tag.valueOf("div", settings);
        assertFalse(value.isBlock());
        assertTrue(value.formatAsBlock());
        assertTrue(value.isInline());
        assertTrue(value.isEmpty());
        assertFalse(value.isSelfClosing());
        assertTrue(DefaultTestCase.defaultSelfClosingMap.containsKey(selfClosingMap.getKey()));
    }

    @Test
    public void testIsBlock() {
        // No-op implementation
    }

    @Test
    public void testFormatAsBlock() {
        // No-op implementation
    }

    @Test
    public void testIsEmpty() {
        // No-op implementation
    }

    @Test
    public void testIsSelfClosing() {
        // No-op implementation
    }

    @Test
    public void testIsKnownTag() {
        // No-op implementation
    }

    @Test
    public void testPreserveWhitespace() {
        // No-op implementation
    }

    @Test
    public void testIsFormListed() {
        // No-op implementation
    }

    @Test
    public void testIsFormSubmittable() {
        // No-op implementation
    }

}
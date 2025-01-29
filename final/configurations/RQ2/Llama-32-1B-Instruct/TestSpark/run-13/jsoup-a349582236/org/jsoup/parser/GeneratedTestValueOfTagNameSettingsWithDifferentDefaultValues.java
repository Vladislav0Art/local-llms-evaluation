package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.BeforeClass;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestValueOfTagNameSettingsWithDifferentDefaultValues {

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

}
package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.BeforeClass;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestName {

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

}
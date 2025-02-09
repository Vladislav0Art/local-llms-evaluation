package org.jsoup.parser;

public class GeneratedGetName_EmptyTagName_ReturnsEmptyString {

    @Mock
    private ParseSettings parseSettings;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public static class Tag {
        public String getName() {
            return "";
        }
    }

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        when(parseSettings.getName()).thenReturn("");
        // Test code here...
    }

}
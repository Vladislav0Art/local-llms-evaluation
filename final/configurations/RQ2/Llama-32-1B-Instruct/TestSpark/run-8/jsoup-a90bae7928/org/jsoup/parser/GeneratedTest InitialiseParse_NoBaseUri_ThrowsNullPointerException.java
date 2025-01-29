package org.jsoup.parser;

public class GeneratedTest InitialiseParse_NoBaseUri_ThrowsNullPointerException {

    @Mock
    private Document parseSettings;

    @InjectMocks
    private XmlTreeBuilder xmlTreeBuilder;

    @Before
    public void setup() {
        when(parseSettings.defaultSettings()).thenReturn(new ParseSettings());
    }

    @Test
    public void test

    InitialiseParse_NoBaseUri_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> xmlTreeBuilder.initialiseParse(null, "", new Parser()));
    }

}
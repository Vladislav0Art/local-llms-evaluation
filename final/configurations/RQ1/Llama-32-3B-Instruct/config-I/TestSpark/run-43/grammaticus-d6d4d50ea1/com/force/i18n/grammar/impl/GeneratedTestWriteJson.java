package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testWriteJson() throws IOException {
        mockStatic(LanguageDictionary.class).given("getNounOverride").willReturn(new NounImpl()).when();
        map.put("test", new GrammaticalTermImpl());
        appendableOut = mock(Appendable.class);
        renamingProvider.writeJson(map, appendableOut, dictionary, Collections.emptyList());
        verify(appendableOut).append("{");
    }

}
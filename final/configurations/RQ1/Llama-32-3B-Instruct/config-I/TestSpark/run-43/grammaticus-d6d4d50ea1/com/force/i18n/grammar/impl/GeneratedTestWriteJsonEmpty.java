package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJsonEmpty {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testWriteJsonEmpty() throws IOException {
        map.put("test", new GrammaticalTermImpl());
        appendableOut = mock(Appendable.class);
        renamingProvider.writeJson(map, appendableOut, dictionary, Collections.emptyList());
        verify(appendableOut).append("{");
    }

}
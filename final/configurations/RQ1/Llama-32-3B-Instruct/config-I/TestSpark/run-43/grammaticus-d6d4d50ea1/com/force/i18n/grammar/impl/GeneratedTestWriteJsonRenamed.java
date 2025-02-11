package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJsonRenamed {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testWriteJsonRenamed() throws IOException {
        map.put("test", new GrammaticalTermImpl());
        appendableOut = mock(Appendable.class);
        renamingProvider.writeJson(map, appendableOut, dictionary, Arrays.asList("test"));
        verify(appendableOut).append("{");
    }

}
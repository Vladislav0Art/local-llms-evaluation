package org.jsoup.parser;

public class GeneratedTestGetValueByNameCaseSensitive {

    public String getName() {
        return null;
    }

    public List<Tag> getValuesByNamespaces(String namespace) {
        return new ArrayList<>();
    }
}

@Test
public void testGetValueByNameCaseSensitive() {
    String tagName = "P";
    Tag tag = new Tag();
    Mockito.when(tag.getName()).thenReturn(tagName);
    assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("P"));
    Mockito.verify(tag).getValuesByNamespaces("P");
}

}
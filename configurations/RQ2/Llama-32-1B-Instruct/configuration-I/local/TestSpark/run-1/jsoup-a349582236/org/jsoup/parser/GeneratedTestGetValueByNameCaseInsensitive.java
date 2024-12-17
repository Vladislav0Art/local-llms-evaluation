package org.jsoup.parser;

public class GeneratedTestGetValueByNameCaseInsensitive {

    public String getName() {
        return null;
    }

    public List<Tag> getValuesByNamespaces(String namespace) {
        return new ArrayList<>();
    }
}

@Test
public void testGetValueByNameCaseInsensitive() {
    String tagName = "P";
    Tag tag = new Tag();
    Mockito.when(tag.getName()).thenReturn(tagName);
    assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("p"));
    Mockito.verify(tag).getValuesByNamespaces("p");
}

}
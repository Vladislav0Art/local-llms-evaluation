package org.jsoup.parser;

public class GeneratedTestGetValuesByNameCaseInsensitive {

    public String getName() {
        return null;
    }

    public List<Tag> getValuesByNamespaces(String namespace) {
        return new ArrayList<>();
    }
}

@Test
public void testGetValuesByNameCaseInsensitive() {
    String tagName = "p";
    Tag tag = new Tag();
    Mockito.when(tag.getName()).thenReturn(tagName);
    assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("p"));
    Mockito.verify(tag).getValuesByNamespaces("p");
}

}
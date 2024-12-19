package org.jsoup.parser;

public class GeneratedTestGetValueByName {

    public String getName() {
        return null;
    }

    public List<Tag> getValuesByNamespaces(String namespace) {
        return new ArrayList<>();
    }
}

@Test
public void testGetValueByName() {
    String tagName = "p";
    Tag tag = new Tag();
    Mockito.when(tag.getName()).thenReturn(tagName);
    assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("p"));
    Mockito.verify(tag).getValuesByNamespaces("p");
}

}
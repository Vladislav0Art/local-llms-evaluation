package org.jsoup.parser;

public class GeneratedTestGetValuesByName {

    public String getName() {
        return null;
    }

    public List<Tag> getValuesByNamespaces(String namespace) {
        return new ArrayList<>();
    }
}

@Test
public void testGetValuesByName() {
    String tagName = "p";
    Tag tag = new Tag();
    Mockito.when(tag.getName()).thenReturn(tagName);
    assertEquals(new ArrayList<>(), tag.getValues());
    Mockito.verify(tag).getValues();
}

}
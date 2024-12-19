package org.jsoup.parser;

public class GeneratedTest {

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

@Test
public void testGetValueByNameCaseInsensitive() {
    String tagName = "P";
    Tag tag = new Tag();
    Mockito.when(tag.getName()).thenReturn(tagName);
    assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("p"));
    Mockito.verify(tag).getValuesByNamespaces("p");
}

@Test
public void testGetValueByNameCaseSensitive() {
    String tagName = "P";
    Tag tag = new Tag();
    Mockito.when(tag.getName()).thenReturn(tagName);
    assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("P"));
    Mockito.verify(tag).getValuesByNamespaces("P");
}

@Test
public void testGetValuesByNameCaseInsensitive() {
    String tagName = "p";
    Tag tag = new Tag();
    Mockito.when(tag.getName()).thenReturn(tagName);
    assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("p"));
    Mockito.verify(tag).getValuesByNamespaces("p");
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
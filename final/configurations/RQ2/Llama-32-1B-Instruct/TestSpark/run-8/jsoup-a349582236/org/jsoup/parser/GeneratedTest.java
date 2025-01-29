package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void testGetters() {
        Tag tag = new Tag();
        assertEquals("name", tag.getName());
    }

    @Test
    public void testNormalName() {
        Tag tag = new Tag();
        String expected = "name";
        String actual = tag.normalName();
        assertNotEquals(expected, actual);
        assertEquals(expected, Normalizer.normalize(tag.name(), Normalizer.NFD));
    }

    @Test
    public void testValueOf() {
        Map<String, ParseSettings> settings = new HashMap<>();
        settings.put("tag_name", "my_tag");
        Tag tag = ValueOf.valueOf("my_tag", settings);
        assertEquals("my_tag", tag.tagName());
    }

    @Test
    public void testBlock() {
        boolean expected = false;
        boolean actual = isBlock();
        assertNotEquals(expected, actual);
    }

    @Test
    public void testFormatAsBlock() {
        boolean expected = true;
        boolean actual = formatAsBlock();
        assertNotEquals(expected, actual);
        assertTrue(actual);
    }

    @Test
    public void testIsInline() {
        boolean expected = false;
        boolean actual = isInline();
        assertNotEquals(expected, actual);
    }

    @Test
    public void testIsEmpty() {
        boolean expected = true;
        boolean actual = isEmpty();
        assertNotEquals(expected, actual);
        assertTrue(actual);
    }

    @Test
    public void testIsSelfClosing() {
        Tag tag = new Tag();
        boolean expected = false;
        boolean actual = isSelfClosing();
        assertNotEquals(expected, actual);
        assertFalse(actual);
    }
}

@Test
public void testNormalize() {
    String tagName = "my_tag";
    String expected = "name";
    String actual = Normalizer.normalize(tagName, Normalizer.NFD);
    assertEquals(expected, actual);
}

@Test
public void testUnnormalize() {
    Tag tag = new Tag();
    String name = "name";
    String expected = tagName;
    String actual = tag.name();
    assertNotEquals(expected, actual);
    assertEquals(name, Normalizer.normalize(tag.name(), Normalizer.NFD));
}
	}

@Test
public void testValueOf() {
    Map<String, Object> settings = new HashMap<>();
    settings.put("tag_name", "my_tag");
    Tag tag = ValueOf.valueOf("my_tag", settings);
    assertEquals("my_tag", tag.tagName());
}

@Test
public void testBlock() {
    boolean expected = false;
    boolean actual = isBlock();
    assertNotEquals(expected, actual);
    assertTrue(actual);
}
	}

@Test
public void testClone() {
    Tag tag = new Tag();
    // no-op implementation
}

}
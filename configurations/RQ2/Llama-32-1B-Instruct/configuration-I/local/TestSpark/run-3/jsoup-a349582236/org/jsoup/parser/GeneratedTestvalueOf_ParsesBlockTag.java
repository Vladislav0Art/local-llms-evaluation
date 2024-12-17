package org.jsoup.parser;

public class GeneratedTestvalueOf_ParsesBlockTag {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tag)) return false;
        Tag tag = (Tag) o;
        return Objects.equals(name, tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String normalName() {
        return name.toLowerCase();
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TagImpl)) return false;
        TagImpl tag = (TagImpl) o;
        return selfClosing == tag.selfClosing && Objects.equals(name, tag.name);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(selfClosing, name);
    }
}

public class TagValueTest {

    private Tag value;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testvalueOf_ParsesBlockTag() {
        value = Tag.valueOf("P", ParseSettings.PARALLEL);
        Assert.assertTrue(value.isBlock());
        Assert.assertFalse(value.formatAsBlock());
        Assert.assertFalse(value.isInline());
        Assert.assertFalse(value.isEmpty());
        Assert.assertFalse(value.isSelfClosing());
        Assert.assertTrue(value.isKnownTag());
    }

}
package org.jsoup.parser;

public class GeneratedTestImage {

    private String name;
    private Object value;
    private int index;

    public Tag(String name) {
        this.name = name;
    }

    public Tag(String name, Object value) {
        this(name);
        this.value = value;
    }

    public Tag(String name, Object value, int index) {
        this(name, value);
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

public class TestSpark {

    public static Tag createTag(String name, Object value, int index) {
        return new Tag(name, value, index);
    }

    @Test
    public void testImage() throws Exception {
        String alt = "alt";
        int index = 2;
        Tag imgTag = createTag("img", alt);
        Tag tag = createTag("img", "", index, imgTag);
        System.out.println(tag.getName());
        System.out.println(imgTag.toString());
    }

}
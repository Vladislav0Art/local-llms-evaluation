package ch.jalu.configme.configurationdata;

public class GeneratedCreate_ReturnsNotEmptyList {

    @Test
    public void create_ReturnsNotEmptyList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property("test", "test"));
        assertNotEquals(0, ((PropertyListBuilder) builder).create().size());
    }

}
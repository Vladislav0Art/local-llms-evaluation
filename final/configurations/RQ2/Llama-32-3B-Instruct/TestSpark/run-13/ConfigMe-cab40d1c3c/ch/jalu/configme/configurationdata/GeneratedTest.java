package ch.jalu.configme.configurationdata;

public class GeneratedTest {

}

public class PropertiesHelper {
    private static List<Property> properties = new ArrayList<>();

    public static void add(Property p) {
        properties.add(p);
    }

    public static List<Property> getProperties() {
        return properties;
    }

    public static Property getProperty() {
        return null; // Return null instead of creating a new instance
    }
}

public class GeneratedTest {

    private PropertiesHelper props;

    @BeforeAll
    public void setup() {
        this.props = new PropertiesHelper();
    }

    @AfterAll
    public void tearDown() {
        props = null;
    }

    @Test
    public void create_EmptyList_ReturnsEmptyList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        assertThat(builder.create(), is(new ArrayList<>()));
    }

}
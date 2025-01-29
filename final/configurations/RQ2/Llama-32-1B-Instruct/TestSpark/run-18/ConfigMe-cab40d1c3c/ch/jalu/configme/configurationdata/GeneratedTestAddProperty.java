package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty {

    @NotNull
    public MockProperties create() {
        return new MockProperties();
    }

    @Mock
    private MockProperties mockProperties;

    @Test
    public void testAddProperty() throws ConfigMeException {
        createdProperties = null;
        underTest.add(mockProperties.create());
        assert createdProperties.size() == 1;
    }
}

public class MockProperties implements Properties {
    private List<Property<?>> properties = new ArrayList<>();

    @Override
    public void addAll(List<Property<?>> properties) {
        this.properties.addAll(properties);
    }

    @Override
    public List<Property<?>> getProperties() {
        return properties;
    }

    public static class BeforeTest {

        @Before
        public void setup() {
        }

        @After
        public void tearDown() {
        }
    }
}

public class MockPropertyBuilder {
    @NotNull
    public MockProperties create() {
        return new MockProperties();
    }

    @Mock
    private MockProperties mockProperties;

    @Override
    public @NotNull List<Property<?>> getProperty() {
        createdProperties = null;
        underTest.add(mockProperties.create());
        assert createdProperties.size() == 1;
        return createdProperties;
    }
}

public class TestConfigurationData {

    public static void main(String[] args) {
        PropertyListBuilderTest test = new PropertyListBuilderTest();
        test.main(args);
    }

}
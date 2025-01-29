package ch.jalu.configme.configurationdata;

public class GeneratedTestPublicMethods {

    public static class AddPropertyTest extends PropertyListBuilder {
        private @NotNull Property<?> property;

        public AddPropertyTest(@NotNull Property<?> property) {
            this.property = property;
        }

        @Override
        public void add(@NotNull Property<?> property) {
            this.property = property;
        }
    }

    public static class CreatePropertyListTest extends PropertyListBuilder {
        private List<Property<?>> propertyList;

        public CreatePropertyListTest() {
            this.propertyList = new ArrayList<>();
        }

        @Override
        public @NotNull List<Property<?>> create() {
            return propertyList;
        }
    }

    public static class GetRootEntriesTest extends PropertyListBuilder {
        private Map<String, Object> rootEntries;

        public GetRootEntriesTest(Map<String, Object> rootEntries) {
            this.rootEntries = rootEntries;
        }

        @Override
        public @NotNull Map<String, Object> getRootEntries() {
            return rootEntries;
        }
    }

    public static class CreatePropertyListAndGetRootEntriesTest extends PropertyListBuilder {
        private List<Property<?>> propertyList;

        public CreatePropertyListAndGetRootEntriesTest(@NotNull List<Property<?>> propertyList) {
            this.propertyList = propertyList;
        }

        @Override
        public @NotNull List<Property<?>> create() {
            return propertyList;
        }
    }

    public static class AssertPublicMethods {
        public boolean publicMethod1() {
            return false;
        }

        public void publicMethod2() {
            throw new UnsupportedOperationException();
        }
    }

    public static class TestAssert {

        @Test
        public void testPublicMethods() {
            CreatePropertyListTest test = new CreatePropertyListTest();
            AssertAssert.publicMethod1();
            AssertAssert.publicMethod2();
        }
    }

    public static void main(String[] args) {
        TestConfigMe test = new TestConfigMe();

        // Add property
        Property<?> property = new Property<>("test", "value");
        test.add(property);

        // Get root entries
        Map<String, Object> rootEntries = new HashMap<>();
        rootEntries.put("key1", "value1");
        test.getRootEntries().put("key2", rootEntries);
        AssertAssert.publicMethod1();

        // Get property by name
        AssertAssert.publicMethod1();
    }

}
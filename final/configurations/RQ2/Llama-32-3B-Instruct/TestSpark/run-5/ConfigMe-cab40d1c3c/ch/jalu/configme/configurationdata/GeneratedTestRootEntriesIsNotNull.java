package ch.jalu.configme.configurationdata;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(PowerMockRunner.class)
public class GeneratedTestRootEntriesIsNotNull {

    @Mock
    private Property property;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public static class Property {
        private String name;
        private Object value;
        private Object type;

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

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }
    }

    @Mock
    private PropertyListBuilder builder;

    @Test
    public void testRootEntriesIsNotNull() {
        Map<String, Object> map = new LinkedHashMap<>();
        when(builder.getName()).thenReturn("test");
        when(builder.getValue()).thenReturn(null);
        when(builder.getType()).thenReturn(null);

        assertNotNull(builder.getRootEntries());
    }
}

public class PropertyListBuilder {

    private String name;
    private Object value;
    private Object type;

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

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Map<String, Object> getRootEntries() {
        return new java.util.HashMap<>();
    }

    public java.util.List<Object> create() {
        return new java.util.ArrayList<>();
    }

}
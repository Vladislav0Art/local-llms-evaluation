package ch.jalu.configme.configurationdata;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(PowerMockRunner.class)
public class GeneratedCreatePropertyList {

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
    public void createPropertyList() {
        when(property.getName()).thenReturn("test");
        when(property.getValue()).thenReturn(null);
        when(property.getType()).thenReturn(null);

        builder = new PropertyListBuilder();
        assertEquals(1, builder.create().size());
    }

}
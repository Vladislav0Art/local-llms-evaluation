package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAdd_addsNewEntryToList {

    @Mock
    private List<Property<?>> properties;

    @Mock
    private Map<String, Object> rootEntries;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("ch.jalu.configme.configurationdata.PropertyListBuilderTest");
    }

    @RunWith(MockitoJUnitRunner.class)
    public class PropertyListBuilder {

        private PropertyListBuilder() {
        }

        @Test
        public void add_addsNewEntryToList() {
            // Arrange & Act
            properties.add(newProperty());
            // Assert
            verify(properties).add(any());
        }

        private Property newProperty() {
            return mock(Property.class);
        }
    }
}

}
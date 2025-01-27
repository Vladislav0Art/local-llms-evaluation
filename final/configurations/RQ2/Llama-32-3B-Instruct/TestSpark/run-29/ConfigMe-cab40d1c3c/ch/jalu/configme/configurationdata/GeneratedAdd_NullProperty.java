package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAdd_NullProperty {

    @Mock
    private List<Property<?>> propertyList;

    @Test
    public void add_NullProperty() {
        // Arrange
        Property<?> property = null;

        // Act and Assert
        assertThrows(ConfigMeException.class, () -> new PropertyListBuilder().add(property).create());
    }

}
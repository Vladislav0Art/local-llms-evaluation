package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        // Given
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property = Mockito.mock(Property.class);
        properties.add(property);

        // When
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);

        // Then
        assertThat(builder.create(), is(properties));
    }

}
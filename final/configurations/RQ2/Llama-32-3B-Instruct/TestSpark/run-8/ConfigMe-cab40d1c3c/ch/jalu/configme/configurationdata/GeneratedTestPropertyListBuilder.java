package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestPropertyListBuilder {

    @Test
    public void testPropertyListBuilder() {
        PropertyListBuilder builder = new PropertyListBuilder();

        // Add some properties to the builder
        builder.addProperty("property1", "value1");
        builder.addProperty("property2", "value2");

        List<Property<?>> expectedProperties = new ArrayList<>();
        expectedProperties.add(new Property<>("property1", "value1"));
        expectedProperties.add(new Property<>("property2", "value2"));

        List<Property<?>> actualProperties = new ArrayList<>(builder.create());

        assertThat(actualProperties, is(expectedProperties));
    }

}
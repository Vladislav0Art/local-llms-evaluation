package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedCreateMethodShouldReturnCorrectProperties {

    @Mock
    private Property<?> property1, property2, property3;

    @Mock
    private Map<String, Object> map1, map2;

    @Test
    public void createMethodShouldReturnCorrectProperties() {
        // given
        List<Property<?>> expectedProperties = new ArrayList<>();
        expectedProperties.add(property1);
        expectedProperties.add(property2);

        // when
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> actualProperties = new ArrayList<>(builder.create());
        // then
        assertThat(actualProperties, is(expectedProperties));
    }

}
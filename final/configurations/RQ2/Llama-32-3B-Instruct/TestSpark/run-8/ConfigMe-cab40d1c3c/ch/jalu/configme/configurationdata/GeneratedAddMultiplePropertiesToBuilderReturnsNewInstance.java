package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedAddMultiplePropertiesToBuilderReturnsNewInstance {

    @Mock
    private Property<?> property1, property2, property3;

    @Mock
    private Map<String, Object> map1, map2;

    @Test
    public void addMultiplePropertiesToBuilderReturnsNewInstance() {
        // when
        PropertyListBuilder builder = new PropertyListBuilder();
        PropertyListBuilder result = builder.add(property2).add(property3);
        // then
        assertThat(result, is(new PropertyListBuilder()));
    }

}
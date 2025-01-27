package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedAddPropertyToBuildertoReturnExistingInstance {

    @Mock
    private Property<?> property1, property2, property3;

    @Mock
    private Map<String, Object> map1, map2;

    @Test
    public void addPropertyToBuildertoReturnExistingInstance() {
        // when
        PropertyListBuilder builder = new PropertyListBuilder();
        PropertyListBuilder existingBuilder = builder;
        builder.add(property1);
        // then
        assertThat(existingBuilder, Mockito.spy(existingBuilder));
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildDirectiveFoundInRegistryTest {

    @Test
    public void buildDirectiveFoundInRegistryTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective directive = new GraphQLDirective("directive", "description", null, null, null);

        Map<String, Object> registry = new HashMap<>();
        registry.put("directive", directive);

        Mockito.when(container.getDirectiveRegistry()).thenReturn(registry);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertEquals(1, directives.length);
        Assert.assertEquals("directive", directives[0].getName());
    }

}
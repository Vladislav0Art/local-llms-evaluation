package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class GeneratedBuildSampleDirectiveTest {

    @Test
    public void buildSampleDirectiveTest() {
        Annotation annotation = Mockito.mock(Annotation.class);
        Mockito.when(annotation.annotationType()).thenReturn((Class) annotation.getClass());

        ProcessingElementsContainer container = new ProcessingElementsContainer();
        container.setDirectiveRegistry(new HashMap<>());

        GraphQLDirective directive = GraphQLDirective.newDirective()
                .name("sampleDirective")
                .validLocations(Introspection.DirectiveLocation.FIELD)
                .argument(GraphQLArgument.newArgument()
                        .name("arg1")
                        .type(Scalars.GraphQLString)
                        .build())
                .build();
        GraphQLArgument argument = GraphQLArgument.newArgument().name("arg1").value("value1").build();
        directive.getArguments().add(argument);
        container.getDirectiveRegistry().put("sampleDirective", directive);

        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);
        GraphQLDirective[] result = builder.build();
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("sampleDirective", result[0].getName());
    }

}
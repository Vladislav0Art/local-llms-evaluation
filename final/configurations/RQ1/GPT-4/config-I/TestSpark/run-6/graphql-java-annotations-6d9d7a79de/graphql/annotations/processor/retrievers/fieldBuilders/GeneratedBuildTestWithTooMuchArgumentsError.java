package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class GeneratedBuildTestWithTooMuchArgumentsError {

    @Test
    public void buildTestWithTooMuchArgumentsError() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);

        Map<String, graphql.introspection.Introspection.Directive> directiveRegistry = new HashMap<>();

        directiveRegistry.put("test", new graphql.introspection.Introspection.Directive(graphql.introspection.Introspection.DirectiveLocation.FIELD, "test", "desc", Collections.emptyList(), Collections.emptyList(), Collections.emptyList()));

        Mockito.when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        Method[] methodArray = new Method[2];
        Mockito.when(field.getDeclaredMethods()).thenReturn(methodArray);

        Mockito.when(field.getAnnotation(graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives.class)).thenReturn(null);

        directivesBuilder.build();
    }

}
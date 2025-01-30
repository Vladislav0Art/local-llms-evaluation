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

public class GeneratedBuildTestSuccessfully {

    @Test
    public void buildTestSuccessfully() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);

        Map<String, graphql.introspection.Introspection.Directive> directiveRegistry = new HashMap<>();

        graphql.introspection.Introspection.Argument argument = new graphql.introspection.Introspection.Argument("argName", "argDesc", GraphQLScalarType.newScalar().name("String").build(), null, Collections.emptyList());
        List<graphql.introspection.Introspection.Argument> argumentList = new ArrayList<>();
        argumentList.add(argument);
        directiveRegistry.put("test", new graphql.introspection.Introspection.Directive(graphql.introspection.Introspection.DirectiveLocation.FIELD, "test", "desc", argumentList, Collections.emptyList(), Collections.emptyList()));

        Mockito.when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);

        Method[] methodArray = new Method[1];
        Mockito.when(field.getDeclaredMethods()).thenReturn(methodArray);

        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[0]);

        Mockito.when(field.getAnnotation(graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives.class)).thenReturn(null);

        GraphQLDirective[] builtDirectives = directivesBuilder.build();

        Assert.assertNotNull(builtDirectives);
        Assert.assertEquals(1, builtDirectives.length);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Collections;

import graphql.language.Directive;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.annotationTypes.directives.definition.GraphQLDirectiveDefinition;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLDirectiveContainer;
import graphql.schema.GraphQLScalarType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWhenTooManyArgumentsFromAnnotationTest {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildWhenTooManyArgumentsFromAnnotationTest() {
        Annotation annotation = new Annotation() {
        };
        Method[] methods = new Method[]{mock(Method.class)};
        when(annotation.annotationType().getDeclaredMethods()).thenReturn(methods);
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{annotation});

        GraphQLDirectiveContainer directiveContainer = mock(GraphQLDirectiveContainer.class);
        when(container.getDirectiveRegistry().get("name")).thenReturn(directiveContainer);
        when(directiveContainer.getDirective()).thenReturn(GraphQLDirective.newDirective().name("name").build());

        GraphQLArgument argument = mock(GraphQLArgument.class);
        when(argument.getType()).thenReturn(mock(GraphQLScalarType.class));
        when(directiveContainer.getDirective().getArguments()).thenReturn(Collections.emptyList());

        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, container);

        assertThrows(GraphQLAnnotationsException.class, builder::build);
    }

}
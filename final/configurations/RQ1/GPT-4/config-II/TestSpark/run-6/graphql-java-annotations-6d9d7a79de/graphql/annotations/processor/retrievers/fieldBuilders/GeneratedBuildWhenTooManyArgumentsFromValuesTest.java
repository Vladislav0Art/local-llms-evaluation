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
public class GeneratedBuildWhenTooManyArgumentsFromValuesTest {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildWhenTooManyArgumentsFromValuesTest() {
        GraphQLDirective mockDirective = mock(GraphQLDirective.class);
        when(mockDirective.name()).thenReturn("name");
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(new GraphQLDirectivesValuesOnly(mockDirective));

        GraphQLDirectiveContainer directiveContainer = mock(GraphQLDirectiveContainer.class);
        when(container.getDirectiveRegistry().get("name")).thenReturn(directiveContainer);
        when(directiveContainer.getDirective()).thenReturn(GraphQLDirective.newDirective().name("name").build());

        GraphQLArgument argument = mock(GraphQLArgument.class);
        when(argument.getType()).thenReturn(mock(GraphQLScalarType.class));
        when(directiveContainer.getDirective().getArguments()).thenReturn(Collections.emptyList());

        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, container);

        assertThrows(GraphQLAnnotationsException.class, builder::build);
    }

    private static class GraphQLDirectivesValuesOnly implements GraphQLDirectives {
        private final GraphQLDirective directive;

        private GraphQLDirectivesValuesOnly(GraphQLDirective directive) {
            this.directive = directive;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return GraphQLDirectives.class;
        }

        @Override
        public Directive[] value() {
            return new Directive[]{new ValueDirective(directive)};
        }
    }

    private static class ValueDirective implements Directive {
        private final GraphQLDirective directive;

        private ValueDirective(GraphQLDirective directive) {
            this.directive = directive;
        }

        @Override
        public String name() {
            return directive.getName();
        }

        @Override
        public String[] argumentsValues() {
            return new String[]{"value"};
        }
    }

}
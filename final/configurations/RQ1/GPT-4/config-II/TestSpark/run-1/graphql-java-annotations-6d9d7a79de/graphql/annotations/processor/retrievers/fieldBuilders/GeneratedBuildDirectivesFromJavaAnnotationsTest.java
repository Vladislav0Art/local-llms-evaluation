package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.Coercing;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Matchers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

public class GeneratedBuildDirectivesFromJavaAnnotationsTest {

    @Test
    public void buildDirectivesFromJavaAnnotationsTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        lenient().when(container.getDirectiveRegistry()).thenReturn(Matchers.anyMap());
        lenient().when(container.getDirectiveRegistry().get(Matchers.anyString())).thenReturn(directive);
        lenient().when(directive.getArguments()).thenReturn(Arrays.asList(new GraphQLArgument("arg1", "description", new GraphQLScalarType("scalarType", "description", Mockito.mock(Coercing.class)), 1)));

        GraphQLDirective[] result = builder.build();
        assertThat(result[0], instanceOf(GraphQLDirective.class));
    }

}
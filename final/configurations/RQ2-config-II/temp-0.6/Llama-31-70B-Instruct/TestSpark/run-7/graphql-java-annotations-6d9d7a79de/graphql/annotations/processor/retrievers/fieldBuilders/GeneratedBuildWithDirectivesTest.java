package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedBuildWithDirectivesTest {

    @Test
    public void buildWithDirectivesTest() {
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, null);

        directivesBuilder.directives = new ArrayList<>();
        directivesBuilder.directives.add(graphQLDirective);

        assertEquals(1, directivesBuilder.build().length);
        assertEquals(graphQLDirective, directivesBuilder.build()[0]);
    }

}
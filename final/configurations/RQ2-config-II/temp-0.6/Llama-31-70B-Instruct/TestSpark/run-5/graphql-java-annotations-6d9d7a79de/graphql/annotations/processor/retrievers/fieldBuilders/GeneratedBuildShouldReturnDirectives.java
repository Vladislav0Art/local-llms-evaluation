package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildShouldReturnDirectives {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement annotatedElement;
    private DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil;

    @Before
    public void setUp() throws Exception {
        annotatedElement = Mockito.mock(AnnotatedElement.class);
        directiveJavaAnnotationUtil = Mockito.mock(DirectiveJavaAnnotationUtil.class);
        directivesBuilder = new DirectivesBuilder(annotatedElement, directiveJavaAnnotationUtil);
    }

    @Test
    public void buildShouldReturnDirectives() {
        // Given
        GraphQLDirective[] directives = {new GraphQLDirective("directive1"), new GraphQLDirective("directive2")};
        when(directiveJavaAnnotationUtil.getDirectiveAnnotations(annotatedElement)).thenReturn(directives);

        // When
        GraphQLDirective[] result = directivesBuilder.build();

        // Then
        assertEquals(directives.length, result.length);
    }

}
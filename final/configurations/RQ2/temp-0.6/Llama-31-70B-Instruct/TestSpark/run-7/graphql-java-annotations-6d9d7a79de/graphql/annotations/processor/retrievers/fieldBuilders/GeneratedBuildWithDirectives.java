package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithDirectives {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        directivesBuilder = new DirectivesBuilder(object, container);
    }

    @Test
    public void buildWithDirectives() {
        when(container.getDirectiveRegistry().containsKey("directiveName")).thenReturn(true);
        List<GraphQLDirective> directives = DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object);
        when(container.getDirectiveRegistry().get("directiveName").getDirective()).thenReturn(directives.get(0));
        GraphQLDirective[] directives1 = directivesBuilder.build();
        assertEquals(1, directives1.length);
    }

}
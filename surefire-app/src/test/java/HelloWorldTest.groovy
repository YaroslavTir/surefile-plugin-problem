import spock.lang.Specification

/**
 * @author ymolodkov
 * @since 0.1
 * @date 18/09/14.
 */
class HelloWorldTest extends Specification {
    def "SayHelloWorld"() {
        setup:
            def helloWorld = new HelloWorld()
        when:
            def hello = helloWorld.sayHello(user)
        then:
            hello == expectedResult
        where:
            user        | expectedResult
            "kartman"   | "hello kartman"
            "stan"      | "hello stan"
            "kyle"      | "hello kyle"
            "kenny"     | "hello kenny"
    }
}

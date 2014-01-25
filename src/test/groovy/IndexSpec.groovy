import geb.spock.GebSpec
import spock.lang.Stepwise

@Stepwise
class IndexSpec extends GebSpec {

    def "given I'm at the index page when I click 'Help' then I'm at the help page"() {
        given:
            to IndexPage
        when:
            $("a").click()
        then:
            at HelpPage
    }
}


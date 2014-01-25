import geb.Page

class HelpPage extends Page {
    static url = "/help.jsp"
    static at = {$("h2").text() == "Help"}
}
package whenItComesOut.WhenItComesOut.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value="search", method = RequestMethod.GET)
    public String getElementsBySearch(@RequestParam("r") String req, @RequestParam("page") Long page) {
        try {
            return "Поисковый запрос - " + req + ", страница - " + page;
        } catch (Exception e) {
            return "Произошла ошибка.";
        }
    }

    @RequestMapping(value="info", method = RequestMethod.GET)
    public String getInformationById(@RequestParam("id") Long id) {
        try {
            return "Полученный номер - " + id;
        } catch (Exception e) {
            return "Произошла ошибка.";
        }
    }

    @RequestMapping(value="calendar", method = RequestMethod.GET)
    public String getElementsByCalendar(@RequestParam("group") String group, @RequestParam("page") Long page) {
        try {
            return "Полученная группа - " + group + ", страница - " + page;
        } catch (Exception e) {
            return "Произошла ошибка.";
        }
    }
}

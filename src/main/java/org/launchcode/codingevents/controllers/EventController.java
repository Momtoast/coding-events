package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("events")
public class EventController {
    @GetMapping()
    public String displayEvents(Model model) {
        ArrayList<String> events = new ArrayList<>();
        events.add("Code with Pride");
        events.add("Boot Camp");
        events.add("Code Like a Girl");
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }
}

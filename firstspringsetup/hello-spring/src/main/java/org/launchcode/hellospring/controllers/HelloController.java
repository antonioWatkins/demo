package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**

 */
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @RequestMapping(value= "form", method=RequestMethod.POST)
    @ResponseBody
    public static String getMessage(String name, String lang) {
        //createMessage(name, lang);
        String greeting = "";
        if (name != "") {
            return name = "world";
        }
            if (lang.equals("Eng")) {
                return "Hello, ";
            } else if (lang.equals("Ger")) {
                greeting = "GUTEN TAG";

            } else if (lang.equals("Ger")) {
                greeting =  "GUTEN TAG";
            } else if (lang.equals("Jap")) {
                greeting ="konnich wa!";
            } else if (lang.equals("Spa")) {
                greeting = "HOLA";
            } else if (lang.equals("Itl")) {
                greeting = "Ciao";
            }
                return  greeting + " " + name;
            }




    @RequestMapping(value = "form", method = RequestMethod.GET)
    public static String createMessage(@RequestParam String name,@RequestParam String lang) {

        return "<html>" +
                "<body>" +
                "<form action = '/hello/message' method = 'post'>" +
                "<input type = 'text' name = 'name' >" +
                "<select language='lang'" +
                "<option value ='none'>pick a language</option>" +
                "<option value ='Eng'>Eng</option>" +
                "<option value ='Ger'>Ger</option>" +
                "<option value ='Jap'>Jap</option>" +
                "<option value ='Spa'>Span</option>" +
                "<option value ='Ita'>Itl</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


//    public static String getMessage(String name, String lang) {
//        createMessage(name, lang);
//        if (name != "") {
//            if (lang.equals("Eng")) {
//                return "Hello, ";
//            } else if (lang.equals("Ger")) {
//                return "GUTEN TAG";
//
//            } else if (lang.equals("Ger")) {
//                return "GUTEN TAG";
//            } else if (lang.equals("Jap")) {
//                return "konnich wa!";
//            } else if (lang.equals("Spa")) {
//                return "HOLA";
//            } else {
//
//
//
//
//            }
//        }return "CIAO";
//    }
}

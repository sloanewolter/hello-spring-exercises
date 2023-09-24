package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //handles request at path /hello
    //  @GetMapping("hello")
    // @ResponseBody
    // public String hello() {
    //   return "Hello, Spring!";
    // }

  //  @GetMapping("goodbye")
  //  public String goodbye() {
       // return "Goodbye, Spring!";
    //}
    //Create a handler that handles requests of the form /hello?name=LaunchCode

  //  @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
   // public String helloWithQueryParam(@RequestParam String name) {
      //  if ()
      //  return "Hello, " + name + "!";

   // }

    //Create a handler that handles requests in the form /hello/LaunchCode

    //@GetMapping("{name}")
  //  public String helloWithPathParam(@PathVariable String name) {
      //  return "Hello " + name + "!";
    //}
    public String createMessage(String n, String l) {
        String greeting = "";
        if (l.equals("english")) {
            greeting = "Hello";
        } else if (l.equals("french")) {
            greeting = "Bonjour";
        } else if (l.equals("spanish")) {
            greeting = "Hola";
        } else if (l.equals("italian")) {
            greeting = "Bonjourno";
        } else if (l.equals("german")) {
            greeting = "Hallo";
        }
        return greeting + " " + n;

    }
    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
        return createMessage(name, language);
    }



    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" +
                "<input type = 'text' name = 'name'>" +
                "<select name = 'language'>" +
                "<option value = 'english', selected>English</option>" +
                "<option value = 'french'>French</option>" +
                "<option value = 'spanish'>Spanish</option>" +
                "<option value = 'italian'>Italian</option>" +
                "<option value = 'german'>German</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }
}

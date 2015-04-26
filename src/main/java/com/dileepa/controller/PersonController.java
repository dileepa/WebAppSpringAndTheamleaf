package com.dileepa.controller;

import com.dileepa.dataLoader.PersonLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * USER : Dileepa
 * DATE : 4/26/15
 * TIME : 12:42 PM
 */
@Controller
public class PersonController
{
    @RequestMapping(value = "/AllPersons", method = RequestMethod.GET)
    public ModelAndView index()
    {
        List personList = PersonLoader.loadAllPersons();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "person/persons" );
        modelAndView.getModel().put( "persons", personList );
        return modelAndView;

    }
}

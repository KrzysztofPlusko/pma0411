package com.example.pma0411.controllers;

import com.example.pma0411.dao.IProjectRepository;
import com.example.pma0411.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    IProjectRepository proRepo;

    @GetMapping("/new")
    public String displayProjectForm(Model model) {
        Project project = new Project();
        model.addAttribute("project",project);
        return "projects/new-project";
    }

    @PostMapping("/save")
    public String createProject(Model model, Project project){

        proRepo.save(project);
        return "redirect:/projects/new";
    }
}

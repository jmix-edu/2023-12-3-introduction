package com.company.taskmanagement.screen.project;

import io.jmix.ui.screen.*;
import com.company.taskmanagement.entity.Project;

@UiController("tm_Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}
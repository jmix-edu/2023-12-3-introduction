package com.company.taskmanagement.screen.task;

import com.company.taskmanagement.app.TaskImportService;
import io.jmix.ui.Notifications;
import io.jmix.ui.component.Button;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.company.taskmanagement.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("tm_Task.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
    @Autowired
    private TaskImportService taskImportService;
    @Autowired
    private CollectionLoader<Task> tasksDl;
    @Autowired
    private Notifications notifications;

    @Subscribe("importTasksBtn")
    public void onImportTasksBtnClick(final Button.ClickEvent event) {
        int importedTasks = taskImportService.importTasks();

        tasksDl.load();

        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Imported tasks")
                .withDescription("Tasks count: " + importedTasks)
                .show();
    }
}
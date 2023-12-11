package com.company.taskmanagement.screen.subtask;

import io.jmix.ui.screen.*;
import com.company.taskmanagement.entity.Subtask;

@UiController("tm_Subtask.edit")
@UiDescriptor("subtask-edit.xml")
@EditedEntityContainer("subtaskDc")
public class SubtaskEdit extends StandardEditor<Subtask> {
}
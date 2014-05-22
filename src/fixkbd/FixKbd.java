package fixkbd;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

import static fixkbd.CustomUser32.*;

public class FixKbd extends AnAction {

    private static CustomUser32 user32 = INSTANCE;

    public FixKbd() {
        super("Fix kbd");
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        user32.LoadKeyboardLayoutW(ENGLISH_LAYOUT, KLF_ACTIVATE + KLF_SETFORPROCESS);
        Project project = event.getData(PlatformDataKeys.PROJECT);
        Messages.showMessageDialog(project, "English enforced.", "Good News!", Messages.getInformationIcon());
    }

}

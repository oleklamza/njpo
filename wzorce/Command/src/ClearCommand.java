package njpo;

import java.util.List;

public class ClearCommand extends Command {

    private List<String> clone;

    public ClearCommand(TodoList todos) {
        super(todos);
    }

    @Override
    void execute() {
        clone = todos.exportItems();
        todos.clear();
    }

    @Override
    void unexecute() {
        todos.importItems(clone);
        clone.clear();
    }

}

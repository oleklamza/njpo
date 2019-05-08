package njpo;

import java.util.ArrayList;
import java.util.List;

public class TodoList implements Cloneable {

    private List<String> todos = new ArrayList();

    public TodoList() {}

    public void add(String todo) {
        todos.add(todo);
    }

    public void remove(int index) {
        todos.remove(index);
    }

    public void edit(int index, String todo) {
        todos.set(index, todo);
    }

    public void clear() {
        todos.clear();
    }

    public int size() {
        return todos.size();
    }

    public void importItems(List<String> todos) {
        this.todos.addAll(todos);
    }

    public List<String> exportItems() {
        List<String> l = new ArrayList();
        l.addAll(todos);
        return l;
    }

    public void print() {
        if (todos.isEmpty()) {
            System.out.println("<empty>");
        } else {
            for (int i = 0; i < todos.size(); ++i) {
                System.out.println(i + ". " + todos.get(i));
            }
        }
        System.out.println("------------------------");
    }


}

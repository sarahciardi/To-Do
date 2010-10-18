

package todo;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        LinkedList<String> todo = new LinkedList<String>();
        todo.add("Fill in List");
        
        while (!todo.isEmpty()) {
            System.out.print("What would you like to do? ");
            String input = in.readLine();
            if (input.equals("show")) {
                for (int i = 0; i < todo.size(); i++) {
                    System.out.println(String.format("%s. %s", i, todo.get(i)));
                }
            } else if (input.equals("add")) {
                System.out.print("What would you like to add? ");
                input = in.readLine();
                todo.add(input);
            } else if (input.equals("remove")) {
                System.out.print("What number would you like to remove? ");
                input = in.readLine();
                todo.remove(Integer.parseInt(input));
            } else {
                System.out.println("You are wrong! The valid commands are:");
                System.out.println("add: adds an item to the list");
                System.out.println("remove: removes an item from the list");
                System.out.println("show: shows the items in the list");
            }
        }
    }

}

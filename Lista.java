/*
 * Buscar un nodo por su posición, enumerando el primero con la posición 0, el siguiente como el 1,
 * etc. y devolver una referencia a él. 
 * Insertar un nuevo nodo antes del último.
 * Intercambiar un nodo por otro buscado.
 */
public class Lista {
    private Node top;

    Lista() {
        top = null;
    }

    // Agregar un nodo
    public void add(String data) {
        Node temp = new Node();
        temp.data = data;
        if (top == null) {
            top = temp;
        } else {
            temp.next = top;
            top = temp;
        }
    }

    // Insertar un nuevo nodo antes del último
    public void insertBeforeLast(String data) {
        Node temp = top;
        Node temp1 = null;
        while (temp != null) {
            if (temp.next == null) {
                temp1 = temp;
            }
            temp = temp.next;
        }
        if (temp1 != null) {
            Node temp2 = new Node();
            temp2.data = data;
            temp2.next = temp1;
            temp = top;
            while (temp != null) {
                if (temp.next == temp1) {
                    temp.next = temp2;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    // Intercambiar un nodo por otro buscado por su data
    public void swap(String data1, String data2) {
        Node temp = top;
        Node temp1 = null;
        Node temp2 = null;
        while (temp != null) {
            if (temp.data.equals(data1)) {
                temp1 = temp;
            }
            if (temp.data.equals(data2)) {
                temp2 = temp;
            }
            temp = temp.next;
        }
        if (temp1 != null && temp2 != null) {
            String aux = temp1.data;
            temp1.data = temp2.data;
            temp2.data = aux;
        }
    }

    // Buscar un nodo por su posición, enumerando el prmero con la posición 0, el
    // siguiente como el 1, etc. y devolver una referencia a él.
    public Node search(int pos) {
        Node temp = top;
        int i = 0;
        while (temp != null) {
            if (i == pos) {
                return temp;
            }
            temp = temp.next;
            i++;
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "";
        Node temp = top;
        while (temp != null) {
            s += temp.data + " ";
            temp = temp.next;
        }
        return s;
    }

}
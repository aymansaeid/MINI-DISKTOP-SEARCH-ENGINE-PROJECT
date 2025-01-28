package NEW;

import NEW.AymanSaeidNode4Linklist;

public class AymanSaeidLinkList<T extends Comparable<T>> {

    AymanSaeidNode4Linklist<T> head;

    void add_first(T data) {
        AymanSaeidNode4Linklist<T> existing = findNode(data);

        if (existing != null) {
            // if the data already exists, increment its frequency
            existing.frequency++;
            return;
        }

        // data does not exist, add a new node at the beginning
        AymanSaeidNode4Linklist<T> newAymanSaeidNode4Linkliste = new AymanSaeidNode4Linklist<>(data);

        // set the next of the new node to point to the current head
        newAymanSaeidNode4Linkliste.next = head;

        // update the head to point to the new node
        head = newAymanSaeidNode4Linkliste;
    }

    private AymanSaeidNode4Linklist<T> findNode(T data) {
        AymanSaeidNode4Linklist<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp; // NODE found
            }
            temp = temp.next;
        }
        return null; // NODE not found
    }

    boolean contains(T data) {
        AymanSaeidNode4Linklist<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true; // Data found in the list
            }
            temp = temp.next;
        }
        return false; // Data not found in the list
    }
}

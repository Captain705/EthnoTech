class Node {
    String page;
    Node next;

    Node(String page) {
        this.page = page;
        this.next = null;
    }
}

class BrowserHistory {

    Node head;

    // Visit Page
    void visitPage(String page) {

        Node newNode = new Node(page);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display History
    void displayHistory() {

        Node temp = head;

        System.out.println("Browser History:");

        while(temp != null) {
            System.out.println(temp.page);
            temp = temp.next;
        }
    }

    // Search Page
    void searchPage(String page) {

        Node temp = head;

        while(temp != null) {

            if(temp.page.equals(page)) {
                System.out.println("Page Found");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Page Not Found");
    }

    // Delete Page
    void deletePage(String page) {

        if(head == null) {
            return;
        }

        if(head.page.equals(page)) {
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null &&
              !temp.next.page.equals(page)) {

            temp = temp.next;
        }

        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Count Pages
    int countPages() {

        int count = 0;

        Node temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}

public class Linkedlistex {

    public static void main(String[] args) {

        BrowserHistory bh = new BrowserHistory();

        bh.visitPage("Google");
        bh.visitPage("YouTube");
        bh.visitPage("Instagram");

        bh.displayHistory();

        bh.searchPage("YouTube");

        bh.deletePage("YouTube");

        System.out.println("\nAfter Deletion:");

        bh.displayHistory();

        System.out.println("\nTotal Pages = "
                + bh.countPages());
    }
}